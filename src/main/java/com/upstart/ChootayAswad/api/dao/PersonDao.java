package com.upstart.ChootayAswad.api.dao;

import com.upstart.ChootayAswad.api.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;


public interface PersonDao extends CrudRepository<Person, Integer> {
//    int addPerson (String name, String Address , String role, String PhoneNumber);
//    List<Person> getAllPerson();
//    Person getPersonByID (UUID id);
//    int deletePerson (UUID id);
//    int updatePerson (UUID id, Person updatedPerson);

}
