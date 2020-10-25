package com.yara.field.controller;

import com.yara.field.client.Weather;
import com.yara.field.domain.Field;
import com.yara.field.dto.FieldDto;
import com.yara.field.dto.PolygonDto;
import com.yara.field.mapper.FieldMapper;
import com.yara.field.service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/fields")
public class FieldController {
    private final FieldService fieldService;

    @Autowired
    public FieldController(FieldService fieldService) {
        this.fieldService = fieldService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<FieldDto> listFields() {
        return fieldService.findAll().stream().map(FieldMapper::fromFieldToFieldDto).collect(Collectors.toList());
    }

    @GetMapping("/{fieldId}")
    @ResponseStatus(HttpStatus.OK)
    public FieldDto getFieldById(@PathVariable("fieldId") UUID fieldId) {
        return FieldMapper.fromFieldToFieldDto(fieldService.findById(fieldId));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FieldDto saveField(@RequestBody FieldDto fieldDto) {
        return FieldMapper.fromFieldToFieldDto(fieldService.save(FieldMapper.fromFieldDtoToField(fieldDto)));
    }

    @PutMapping("/{fieldId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public FieldDto updateField(@RequestBody FieldDto fieldDto, @PathVariable("fieldId") UUID fieldId) {
        Field field = FieldMapper.fromFieldDtoToField(fieldDto);
        return FieldMapper.fromFieldToFieldDto(fieldService.update(field, fieldId));
    }

    @DeleteMapping("/{fieldId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteField(@PathVariable("fieldId") UUID fieldId) {
        fieldService.delete(fieldId);
    }

    @GetMapping("/{fieldId}/polygon")
    @ResponseStatus(HttpStatus.OK)
    public PolygonDto createFieldPolygon(@PathVariable("fieldId") UUID fieldId) {
        return fieldService.createFieldPolygon(fieldId);
    }

    @GetMapping("/{fieldId}/weather")
    @ResponseStatus(HttpStatus.OK)
    public List<Weather> getWeatherHistory(@PathVariable("fieldId") UUID fieldId) {
        return fieldService.getWeatherHistory(fieldId);
    }
}
