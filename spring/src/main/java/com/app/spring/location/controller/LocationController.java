package com.app.spring.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String saveLocatiion( @ModelAttribute("loc") Location loc , BindingResult result ,  ModelMap map) {
		
		if(result.hasErrors()) { 
		
			//error.jsp need to add 
			return "error";
		}
		Location location  = locationService.save(loc);
		map.addAttribute("savemsg", "Location Saved with location Id :"+location.getLocId());
		return "redirect:/locations/display";
		
	}
	
	@GetMapping("/createLoc")
	public String createLocatiion(Model model) {
		model.addAttribute("loc", new Location());
		return "createLoction";
		}
	
	@GetMapping("/deleteById")
	public String deleteLocatiion(@RequestParam("locId")Long locId , ModelMap model) {
		 locationService.deleteLocation(locId);
		return "redirect:/locations/display";
		
	}
	
	@GetMapping("/updateById")
	public String showEditLocatiion(@RequestParam("locId")Long locId , ModelMap model) {
		Location loc =  locationService.findById(locId);
		//model.addAttribute("loc",loc );
		model.addAttribute("loc", loc);
		return "editLocation";
		
	}
	@PostMapping("/edit")
	public String editLocation(@ModelAttribute("loc") Location loc , BindingResult result ,  ModelMap map) {
		if(result.hasErrors()) { 
			
			//error.jsp need to add 
			return "error";
		}
		Location location  = locationService.editLocation(loc);
		map.addAttribute("savemsg", "Location Saved with location Id :"+location.getLocId());
		return "redirect:/locations/display";
	}
}
