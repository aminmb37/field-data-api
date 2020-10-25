package com.yara.field.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.geo.Point;

import javax.persistence.*;

@Entity
@Table(name = "coordinate")
public class Coordinate extends BaseEntity {
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "boundary_id")
    private Boundary boundary;

    @Column(name = "coordinate")
    private Point point;

    public Coordinate() {
    }

    public Boundary getBoundary() {
        return boundary;
    }

    public void setBoundary(Boundary boundary) {
        this.boundary = boundary;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "point=" + point +
                "} " + super.toString();
    }
}
