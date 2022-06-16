package com.app.spring.location.service;

import java.util.List;

import com.app.spring.location.entities.Location;

public interface LocationService {

	List<Location> displayLocatiion();

	void save(Location loc);

}
