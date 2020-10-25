package com.yara.field.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.util.UUID;

public class FieldDto extends BaseItem {
    private String name;
    private String countryCode;

    @JsonProperty("geo_json")
    private BoundaryDto boundaryDto;

    public FieldDto() {
    }

    public FieldDto(UUID id, Timestamp created, Timestamp updated, String name,
                    String countryCode, BoundaryDto boundaryDto) {
        super(id, created, updated);
        this.name = name;
        this.countryCode = countryCode;
        this.boundaryDto = boundaryDto;
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

    public BoundaryDto getBoundaryDto() {
        return boundaryDto;
    }

    public void setBoundaryDto(BoundaryDto boundaryDto) {
        this.boundaryDto = boundaryDto;
    }

    @Override
    public String toString() {
        return "FieldDto{" +
                "name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", boundaryDto=" + boundaryDto +
                "} " + super.toString();
    }
}
