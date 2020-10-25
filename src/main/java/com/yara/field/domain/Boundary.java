package com.yara.field.domain;

import com.yara.field.value.GeoJsonType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "boundary")
public class Boundary extends BaseEntity {
    @Column(name = "geo_json_type")
    private GeoJsonType geoJsonType;

    @OneToMany(mappedBy = "boundary", cascade = CascadeType.ALL)
    private List<GeoProperty> properties;

    @Embedded
    private Geometry geometry;

    public Boundary() {
    }

    public Boundary(GeoJsonType type, List<GeoProperty> properties, Geometry geometry) {
        geoJsonType = type;
        this.properties = properties;
        this.geometry = geometry;
    }

    public GeoJsonType getGeoJsonType() {
        return geoJsonType;
    }

    public void setGeoJsonType(GeoJsonType geoJsonType) {
        this.geoJsonType = geoJsonType;
    }

    public List<GeoProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<GeoProperty> properties) {
        this.properties = properties;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    @Override
    public String toString() {
        return "Boundary{" +
                "geoJsonType=" + geoJsonType +
                ", properties=" + properties +
                ", geometry=" + geometry +
                "} " + super.toString();
    }
}
