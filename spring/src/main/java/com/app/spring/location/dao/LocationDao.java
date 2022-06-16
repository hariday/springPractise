package com.app.spring.location.dao;

import java.util.List;

import com.app.spring.location.entities.Location;

public interface LocationDao {
	List<Location> displayLocatiion();

	Location save(Location loc);

	void deleteLocation(Long locId);

	Location findById(Long locId);

	Location editLocation(Location loc);
}
