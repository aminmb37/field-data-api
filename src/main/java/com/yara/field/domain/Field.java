package com.yara.field.domain;

import javax.persistence.*;

@Entity
@Table(name = "field")
public class Field extends BaseEntity {
    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "country_code", length = 3)
    private String countryCode;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "boundary_id")
    private Boundary boundary;

    public Field() {
    }

    public Field(String name, String countryCode, Boundary boundary) {
        this.name = name;
        this.countryCode = countryCode;
        this.boundary = boundary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Boundary getBoundary() {
        return boundary;
    }

    public void setBoundary(Boundary boundary) {
        this.boundary = boundary;
    }

    @Override
    public String toString() {
        return "Field{" +
                "name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", boundary=" + boundary +
                "} " + super.toString();
    }
}
