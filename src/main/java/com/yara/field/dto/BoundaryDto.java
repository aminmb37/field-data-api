package com.yara.field.dto;

import com.yara.field.value.GeoJsonType;

import java.sql.Timestamp;
import java.util.UUID;

public class BoundaryDto extends BaseItem {
    private GeoJsonType type;
    private GeoPropertiesDto properties;
    private GeometryDto geometry;

    public BoundaryDto() {
    }

    public BoundaryDto(UUID id, Timestamp created, Timestamp updated, GeoJsonType geoJsonType,
                       GeoPropertiesDto propertiesDto, GeometryDto geometry) {
        super(id, created, updated);
        type = geoJsonType;
        properties = propertiesDto;
        this.geometry = geometry;
    }

    public GeoJsonType getType() {
        return type;
    }

    public void setType(GeoJsonType type) {
        this.type = type;
    }

    public GeoPropertiesDto getProperties() {
        return properties;
    }

    public void setProperties(GeoPropertiesDto properties) {
        this.properties = properties;
    }

    public GeometryDto getGeometry() {
        return geometry;
    }

    public void setGeometry(GeometryDto geometry) {
        this.geometry = geometry;
    }

    @Override
    public String toString() {
        return "BoundaryDto{" +
                "type=" + type +
                ", geoPropertiesDto=" + properties +
                ", geometryDto=" + geometry +
                "} " + super.toString();
    }
}
