package com.hospitalmanagementsystem.conroller;

import com.hospitalmanagementsystem.entity.Patient;
import com.hospitalmanagementsystem.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/patient")
public class PatientController {

    private final PatientRepository patientRepository;

    @PostMapping("/create_patient")
    public Patient createPatient(@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }

    @GetMapping("get_patients")
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

}
