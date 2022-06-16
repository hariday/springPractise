package com.app.spring.location.service.impl;

import java.util.List;

import javax.transaction.Transactional;

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
		return locationDao.displayLocatiion();
	}

	@Transactional
	@Override
	public Location save(Location loc) {
		return locationDao.save(loc);
	}

	@Override
	public void deleteLocation(Long locId) {
		locationDao.deleteLocation(locId);		
	}

	@Override
	public Location findById(Long locId) {
		return locationDao.findById(locId);
	}

	@Override
	public Location editLocation(Location loc) {
		return locationDao.editLocation(loc);
	}

}
