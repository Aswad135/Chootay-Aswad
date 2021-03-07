package com.upstart.ChootayAswad.api.controller;

import com.upstart.ChootayAswad.api.dao.PersonDao;
import com.upstart.ChootayAswad.api.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonDao dao;

    @PostMapping("/addPerson")
    public int addPerson(@RequestBody  List<Person> personList){
        dao.saveAll(personList);
        return 1;
    }


    @GetMapping("/getPerson")
    public List<Person> getPerson(){
        return (List<Person>) dao.findAll();
    }


    @GetMapping("/")
    public String welcomePage(){
        return "<h1>Welcome</h1>";
    }
}
