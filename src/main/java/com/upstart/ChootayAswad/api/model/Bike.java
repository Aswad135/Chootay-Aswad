package com.upstart.ChootayAswad.api.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public @Data class Bike {

    private UUID id;
    private String Model;
    private String Manufacturer;
    private int year;
    private double price;

}
