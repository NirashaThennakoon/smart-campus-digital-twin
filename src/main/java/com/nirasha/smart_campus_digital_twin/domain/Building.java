package com.nirasha.smart_campus_digital_twin.domain;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "building")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String code;

    @Column(nullable = false)
    private String name;
}
