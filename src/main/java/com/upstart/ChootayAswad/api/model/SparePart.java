package com.upstart.ChootayAswad.api.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public @Data
class SparePart {
    private UUID id;
    private String partName;
    private String Description;
    private double price;

}
