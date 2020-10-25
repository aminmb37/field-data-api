package com.yara.field.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "geo_property")
public class GeoProperty extends BaseEntity {
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "boundary_id")
    private Boundary boundary;

    @Column(name = "prop_key", length = 20)
    private String propKey;

    @Column(name = "prop_val", length = 50)
    private String propVal;

    public GeoProperty() {
    }

    public Boundary getBoundary() {
        return boundary;
    }

    public void setBoundary(Boundary boundary) {
        this.boundary = boundary;
    }

    public String getPropKey() {
        return propKey;
    }

    public void setPropKey(String propKey) {
        this.propKey = propKey;
    }

    public String getPropVal() {
        return propVal;
    }

    public void setPropVal(String propVal) {
        this.propVal = propVal;
    }

    @Override
    public String toString() {
        return "GeoProperty{" +
                "propKey='" + propKey + '\'' +
                ", propVal='" + propVal + '\'' +
                "} " + super.toString();
    }
}
