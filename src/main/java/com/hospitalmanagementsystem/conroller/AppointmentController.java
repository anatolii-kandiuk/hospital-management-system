package com.hospitalmanagementsystem.conroller;

import com.hospitalmanagementsystem.entity.Appointment;
import com.hospitalmanagementsystem.repository.AppointmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/appointment")
public class AppointmentController {
    private final AppointmentRepository appointmentRepository;

    @PostMapping("/create_appointment")
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @GetMapping("get_appointments")
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }
}
