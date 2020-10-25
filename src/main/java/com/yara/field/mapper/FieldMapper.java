package com.yara.field.mapper;

import com.yara.field.domain.Coordinate;
import com.yara.field.domain.Field;
import com.yara.field.domain.GeoProperty;
import com.yara.field.dto.FieldDto;

public class FieldMapper {
    public static FieldDto fromFieldToFieldDto(Field field) {
        return new FieldDto(field.getId(), field.getCreated(), field.getUpdated(),
                field.getName(), field.getCountryCode(), field.getBoundary());
    }

    public static Field fromFieldDtoToField(FieldDto fieldDto) {
        Field field = new Field(fieldDto.getName(), fieldDto.getCountryCode(), fieldDto.getBoundary());
        for (GeoProperty property : field.getBoundary().getProperties()) {
            property.setBoundary(field.getBoundary());
        }
        for (Coordinate coordinate : field.getBoundary().getGeometry().getCoordinates()) {
            coordinate.setBoundary(field.getBoundary());
        }
        return field;
    }
}
