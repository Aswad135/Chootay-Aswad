package com.upstart.ChootayAswad.api.dao;

import com.upstart.ChootayAswad.api.model.Bike;
import org.springframework.data.repository.CrudRepository;

public interface BikeDao extends CrudRepository<Bike, Integer> {
}
