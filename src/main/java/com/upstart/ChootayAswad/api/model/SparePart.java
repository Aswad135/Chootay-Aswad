package com.upstart.ChootayAswad.api.model;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class SparePart {
    private UUID id;
    private String partName;
    private String Description;
    private double price;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public SparePart(UUID id, String partName, String description, double price) {
        this.id = id;
        this.partName = partName;
        Description = description;
        this.price = price;
    }

    public SparePart() {
    }
}
