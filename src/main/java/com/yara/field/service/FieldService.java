package com.yara.field.service;

import com.yara.field.domain.Field;

import java.util.List;
import java.util.UUID;

public interface FieldService {
    List<Field> findAll();

    Field findById(UUID fieldId);

    Field save(Field field);

    Field update(Field field, UUID fieldId);

    void delete(UUID fieldId);
}
