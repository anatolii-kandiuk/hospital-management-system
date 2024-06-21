package com.hospitalmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String bloodGroup;
    private String prescription;
    private String dose;
    private String fees;
    private String urgency;
}
