package com.upstart.ChootayAswad.api.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;


@Entity
@Table(name = "Bike")
@Component
public @Data class Bike {

    @Id
    @GeneratedValue
    private int id;
    private String Model;
    private String Manufacturer;
    private int year;
    private double price;

}
