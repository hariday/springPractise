package com.app.spring.location.service;

import java.util.List;

import com.app.spring.location.entities.Location;

public interface LocationService {

	List<Location> displayLocatiion();

	Location save(Location loc);

	void deleteLocation(Long locId);

	Location findById(Long locId);

	Location editLocation(Location loc);

}
