package com.app.spring.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.spring.location.entities.Location;
import com.app.spring.location.service.LocationService;

@Controller
@RequestMapping("/locations")
public class LocationController {

	@Autowired
	private LocationService locationService;

	@GetMapping("/display")
	public String displayLocatiion(ModelMap map) {
		List<Location> locList= locationService.displayLocatiion();
		map.addAttribute("locationDisplay", locList);
		return "displayLocation";
	}
	
	
	@PostMapping("/save")
	public String saveLocatiion(ModelMap map) {
		return null;
		
	}
}
