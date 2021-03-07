package com.upstart.ChootayAswad.api.model;

import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public class Person {
    private UUID id;
    private String name;
    private String role;
    private String address;
    private String phoneNumber;

    public Person(UUID id, String name, String role, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Person() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
