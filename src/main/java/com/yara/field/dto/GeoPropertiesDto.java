package com.yara.field.dto;

import com.yara.field.domain.GeoProperty;

import java.util.List;

public class GeoPropertiesDto {
    private List<GeoProperty> geoProperties;

    public GeoPropertiesDto() {
    }

    public GeoPropertiesDto(List<GeoProperty> geoProperties) {
        this.geoProperties = geoProperties;
    }

    public List<GeoProperty> getGeoProperties() {
        return geoProperties;
    }

    public void setGeoProperties(List<GeoProperty> geoProperties) {
        this.geoProperties = geoProperties;
    }

    @Override
    public String toString() {
        return "GeoPropertyWrapper{" +
                "geoProperties=" + geoProperties +
                '}';
    }
}
