package com.yara.field.service;

import com.yara.field.client.Weather;
import com.yara.field.domain.Field;
import com.yara.field.dto.PolygonDto;

import java.util.List;
import java.util.UUID;

public interface FieldService {
    List<Field> findAll();

    Field findById(UUID fieldId);

    Field save(Field field);

    Field update(Field field, UUID fieldId);

    void delete(UUID fieldId);

    PolygonDto createFieldPolygon(UUID fieldId);

    List<Weather> getWeatherHistory(UUID fieldId);
}
