package com.yara.field.repository;

import com.yara.field.domain.Field;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface FieldRepository extends CrudRepository<Field, UUID> {
}
