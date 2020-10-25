package com.yara.field.mapper;

import com.yara.field.domain.GeoProperty;
import com.yara.field.dto.GeoPropertiesDto;

import java.util.List;

public class GeoPropertyMapper {
    public static GeoPropertiesDto fromGeoPropertiesToGeoPropertiesDto(List<GeoProperty> properties) {
        return new GeoPropertiesDto(properties);
    }

    public static List<GeoProperty> fromGeoPropertiesDtoToGeoProperties(GeoPropertiesDto propertiesDto) {
        return propertiesDto.getGeoProperties();
    }
}
