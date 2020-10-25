package com.yara.field.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Timestamp;
import java.util.UUID;

public class BaseItem {
    @JsonIgnoreProperties(allowGetters = true)
    private UUID id;

    @JsonIgnoreProperties(allowGetters = true)
    private Timestamp created;

    @JsonIgnoreProperties(allowGetters = true)
    private Timestamp updated;

    public BaseItem() {
    }

    public BaseItem(UUID id, Timestamp created, Timestamp updated) {
        this.id = id;
        this.created = created;
        this.updated = updated;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "BaseItem{" +
                "id=" + id +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
