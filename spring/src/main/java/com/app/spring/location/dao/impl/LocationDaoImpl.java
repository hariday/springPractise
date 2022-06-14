package com.app.spring.location.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.spring.location.dao.LocationDao;
import com.app.spring.location.entities.Location;
import com.app.spring.location.repository.LocationRepository;

@Repository
public class LocationDaoImpl implements LocationDao {

	@Autowired
	private LocationRepository locRepo;
	@Override
	public List<Location> displayLocatiion() {
		return locRepo.findAll();
	}

}
