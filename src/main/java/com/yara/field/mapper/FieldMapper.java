package com.yara.field.mapper;

import com.yara.field.domain.Field;
import com.yara.field.dto.FieldDto;

import java.util.Optional;

public class FieldMapper {
    public static FieldDto fromFieldToFieldDto(Field field) {
        return new FieldDto(field.getId(), field.getCreated(), field.getUpdated(), field.getName(),
                field.getCountryCode(), BoundaryMapper.fromBoundaryToBoundaryDto(field.getBoundary()));
    }

    public static Field fromFieldDtoToField(FieldDto fieldDto) {
        Field field = new Field(fieldDto.getName(), fieldDto.getCountryCode(),
                BoundaryMapper.fromBoundaryDtoToBoundary(fieldDto.getBoundaryDto()));

        Optional.ofNullable(field.getBoundary().getProperties()).ifPresent(geoProperties ->
                geoProperties.forEach(geoProperty -> geoProperty.setBoundary(field.getBoundary())));

        field.getBoundary().getGeometry().getCoordinates()
                .forEach(coordinate -> coordinate.setBoundary(field.getBoundary()));

        return field;
    }
}
