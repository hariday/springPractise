package com.app.spring.location.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.spring.location.dao.LocationDao;
import com.app.spring.location.entities.Location;
import com.app.spring.location.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService{

	@Autowired
	private LocationDao locationDao;

	@Override
	public List<Location> displayLocatiion() {
		// TODO Auto-generated method stub
		return locationDao.displayLocatiion();
	}

}
