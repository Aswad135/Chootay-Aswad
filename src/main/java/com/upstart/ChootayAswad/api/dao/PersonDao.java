package com.upstart.ChootayAswad.api.dao;
import com.upstart.ChootayAswad.api.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonDao extends CrudRepository<Person, Integer> {}
