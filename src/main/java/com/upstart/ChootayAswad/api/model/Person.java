package com.upstart.ChootayAswad.api.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public @Data class Person {
    private UUID id;
    private String name;
    private String role;
    private String address;
    private String phoneNumber;

}
