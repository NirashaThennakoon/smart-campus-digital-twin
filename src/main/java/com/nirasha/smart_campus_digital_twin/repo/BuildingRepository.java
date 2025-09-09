package com.nirasha.smart_campus_digital_twin.repo;

import com.nirasha.smart_campus_digital_twin.domain.Building;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BuildingRepository extends JpaRepository<Building, Long> {
    Optional<Building> findByCode(String code);
}