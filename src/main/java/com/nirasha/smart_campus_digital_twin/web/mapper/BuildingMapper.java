package com.nirasha.smart_campus_digital_twin.web.mapper;

import com.nirasha.smart_campus_digital_twin.domain.Building;
import com.nirasha.smart_campus_digital_twin.web.dto.BuildingDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BuildingMapper {
    BuildingDto toDto(Building entity);
    Building toEntity(BuildingDto dto);
}