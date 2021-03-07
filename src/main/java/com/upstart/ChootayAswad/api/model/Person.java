package com.upstart.ChootayAswad.api.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="Person")
@Component
public @Data class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String role;
    private String address;
    private String phoneNumber;

}
