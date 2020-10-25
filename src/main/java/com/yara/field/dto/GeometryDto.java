package com.yara.field.dto;

import com.yara.field.value.GeometryType;

import java.util.List;

public class GeometryDto {
    private GeometryType type;
    private List<List<Double[]>> coordinates;

    public GeometryDto() {
    }

    public GeometryDto(GeometryType geometryType, List<List<Double[]>> coordinates) {
        type = geometryType;
        this.coordinates = coordinates;
    }

    public GeometryType getType() {
        return type;
    }

    public void setType(GeometryType type) {
        this.type = type;
    }

    public List<List<Double[]>> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<List<Double[]>> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "GeometryDto{" +
                "type=" + type +
                ", coordinates=" + coordinates +
                '}';
    }
}
