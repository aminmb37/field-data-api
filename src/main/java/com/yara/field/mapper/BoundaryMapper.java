package com.yara.field.mapper;

import com.yara.field.domain.Boundary;
import com.yara.field.dto.BoundaryDto;

public class BoundaryMapper {
    public static BoundaryDto fromBoundaryToBoundaryDto(Boundary boundary) {
        return new BoundaryDto(boundary.getId(), boundary.getCreated(),
                boundary.getUpdated(), boundary.getGeoJsonType(),
                GeoPropertyMapper.fromGeoPropertiesToGeoPropertiesDto(boundary.getProperties()),
                GeometryMapper.fromGeometryToGeometryDto(boundary.getGeometry()));
    }

    public static Boundary fromBoundaryDtoToBoundary(BoundaryDto boundaryDto) {
        return new Boundary(boundaryDto.getType(),
                GeoPropertyMapper.fromGeoPropertiesDtoToGeoProperties(boundaryDto.getProperties()),
                GeometryMapper.fromGeometryDtoToGeometry(boundaryDto.getGeometry()));
    }
}
