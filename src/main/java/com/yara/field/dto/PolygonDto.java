package com.yara.field.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class PolygonDto extends FieldDto {
    @JsonProperty("id")
    private String polygonId;

    private Double[] center;
    private Double area;
    private String userId;

    public PolygonDto() {
    }

    public String getPolygonId() {
        return polygonId;
    }

    public void setPolygonId(String polygonId) {
        this.polygonId = polygonId;
    }

    public Double[] getCenter() {
        return center;
    }

    public void setCenter(Double[] center) {
        this.center = center;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "PolygonDto{" +
                "polygonId='" + polygonId + '\'' +
                ", center=" + Arrays.toString(center) +
                ", area=" + area +
                ", userId='" + userId + '\'' +
                "} " + super.toString();
    }
}
