package com.upstart.ChootayAswad.api.model;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Bike {

    private UUID id;
    private String Model;
    private String Manufacturer;
    private int year;
    private double price;

    public Bike(UUID id, String model, String manufacturer, int year, double price) {
        this.id = id;
        Model = model;
        Manufacturer = manufacturer;
        this.year = year;
        this.price = price;
    }

    public Bike() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
