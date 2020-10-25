package com.yara.field.service;

import com.yara.field.client.AgroMonitoringClient;
import com.yara.field.client.Weather;
import com.yara.field.client.WeatherClient;
import com.yara.field.domain.Field;
import com.yara.field.dto.PolygonDto;
import com.yara.field.mapper.FieldMapper;
import com.yara.field.repository.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class FieldServiceImpl implements FieldService {
    private final static int HISTORY_DAYS_COUNT = 7;

    private final FieldRepository fieldRepository;

    @Autowired
    public FieldServiceImpl(FieldRepository fieldRepository) {
        this.fieldRepository = fieldRepository;
    }

    @Override
    public List<Field> findAll() {
        List<Field> fields = new ArrayList<>();
        fieldRepository.findAll().forEach(fields::add);
        return fields;
    }

    @Override
    public Field findById(UUID fieldId) {
        return fieldRepository.findById(fieldId)
                .orElseThrow(() -> new EntityNotFoundException("Field not found: " + fieldId));
    }

    @Override
    public Field save(Field field) {
        return fieldRepository.save(field);
    }

    @Override
    public Field update(Field field, UUID fieldId) {
        if (fieldRepository.existsById(fieldId)) {
            field.setId(fieldId);
            fieldRepository.save(field);
            return field;
        } else {
            throw new EntityNotFoundException("Field not found: " + fieldId);
        }
    }

    @Override
    public void delete(UUID fieldId) {
        if (fieldRepository.existsById(fieldId)) {
            fieldRepository.deleteById(fieldId);
        } else {
            throw new EntityNotFoundException("Field not found: " + fieldId);
        }
    }

    @Override
    public List<Weather> getWeatherHistory(UUID fieldId) {
        Field field = fieldRepository.findById(fieldId)
                .orElseThrow(() -> new EntityNotFoundException("Field not found: " + fieldId));

        WeatherClient weatherClient = new AgroMonitoringClient();

        PolygonDto polygonDto = weatherClient.createPolygon(FieldMapper.fromFieldToFieldDto(field));

        long time = System.currentTimeMillis() / 1000;
        String startDay = String.valueOf(time - 7 * 24 * 60 * 60);
        String endDay = String.valueOf(time);

        return weatherClient.weatherHistory(polygonDto.getPolygonId(), startDay, endDay);
    }
}
