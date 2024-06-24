package com.hospitalmanagementsystem.conroller;

import com.hospitalmanagementsystem.entity.Medicine;
import com.hospitalmanagementsystem.repository.MedicineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/medicine")
public class MedicineController {
    private final MedicineRepository medicineRepository;

    @PostMapping("/create_medicine")
    public Medicine createMedicine(@RequestBody Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    @GetMapping("get_medicines")
    public List<Medicine> getAllMedicine() {
        return medicineRepository.findAll();
    }
}
