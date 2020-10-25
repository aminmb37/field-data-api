package com.yara.field.mapper;

import com.yara.field.domain.Coordinate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CoordinateMapper {
    public static List<List<Double[]>> fromCoordinateToPointArray(List<Coordinate> coordinates) {
        List<Double[]> points = coordinates.stream()
                .map(coordinate -> new Double[]{coordinate.getPoint().getX(), coordinate.getPoint().getY()})
                .collect(Collectors.toList());
        List<List<Double[]>> coords = new ArrayList<>();
        coords.add(points);
        return coords;
    }

    public static List<Coordinate> fromPointArrayToCoordinate(List<List<Double[]>> coordinates) {
        return coordinates.get(0).stream()
                .map(point -> new Coordinate(point[0], point[1])).collect(Collectors.toList());
    }
}
