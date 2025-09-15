package com.nirasha.smart_campus_digital_twin.web;

import com.nirasha.smart_campus_digital_twin.repo.BuildingRepository;
import com.nirasha.smart_campus_digital_twin.web.dto.BuildingDto;
import com.nirasha.smart_campus_digital_twin.web.mapper.BuildingMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/buildings")
@RequiredArgsConstructor
public class BuildingController {

  private final BuildingRepository repo;
  private final BuildingMapper mapper;

  @GetMapping
  public List<BuildingDto> all() {
    return repo.findAll().stream().map(mapper::toDto).toList();
  }

  @PostMapping
  public BuildingDto create(@RequestBody BuildingDto dto) {
    return mapper.toDto(repo.save(mapper.toEntity(dto)));
  }
}
