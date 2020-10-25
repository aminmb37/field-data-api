package com.yara.field.mapper;

import com.yara.field.domain.Geometry;
import com.yara.field.dto.GeometryDto;

public class GeometryMapper {
    public static GeometryDto fromGeometryToGeometryDto(Geometry geometry) {
        return new GeometryDto(geometry.getGeometryType(),
                CoordinateMapper.fromCoordinateToPointArray(geometry.getCoordinates()));
    }

    public static Geometry fromGeometryDtoToGeometry(GeometryDto geometryDto) {
        return new Geometry(geometryDto.getType(),
                CoordinateMapper.fromPointArrayToCoordinate(geometryDto.getCoordinates()));
    }
}
