package com.upstart.ChootayAswad.api.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "Spare_Parts")
@Component
public @Data
class SparePart {
    @Id
    @GeneratedValue
    private int id;
    private String partName;
    private String Description;
    private double price;

}
