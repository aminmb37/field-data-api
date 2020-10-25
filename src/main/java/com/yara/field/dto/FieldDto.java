package com.yara.field.dto;

import com.yara.field.domain.Boundary;

import java.sql.Timestamp;
import java.util.Locale;
import java.util.UUID;

public class FieldDto extends BaseItem {
    private String name;
    private String countryCode;
    private Boundary boundary;

    public FieldDto() {
    }

    public FieldDto(UUID id, Timestamp created, Timestamp updated, String name,
                    String countryCode, Boundary boundary) {
        super(id, created, updated);
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
        return "FieldDto{" +
                "name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", boundary=" + boundary +
                "} " + super.toString();
    }
}
