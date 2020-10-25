package com.yara.field.domain;

import com.yara.field.value.GeometryType;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.OneToMany;
import java.util.List;

@Embeddable
public class Geometry {
    @Column(name = "geometry_type")
    private GeometryType geometryType;

    @OneToMany(mappedBy = "boundary", cascade = CascadeType.ALL)
    private List<Coordinate> coordinates;

    public Geometry() {
    }

    public Geometry(GeometryType type, List<Coordinate> coordinates) {
        geometryType = type;
        this.coordinates = coordinates;
    }

    public GeometryType getGeometryType() {
        return geometryType;
    }

    public void setGeometryType(GeometryType geometryType) {
        this.geometryType = geometryType;
    }

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Geometry{" +
                "geometryType=" + geometryType +
                ", coordinates=" + coordinates +
                '}';
    }
}
