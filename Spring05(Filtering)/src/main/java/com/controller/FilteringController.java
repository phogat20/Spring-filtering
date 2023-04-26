package com.controller;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.model.User;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public MappingJacksonValue filtering() {
		User user = new User("value1", "value2", "value3");

		MappingJacksonValue jacksonValue = new MappingJacksonValue(getClass());
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("first");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeFIlter", filter);

		jacksonValue.setFilters(filters);

		return jacksonValue;
	}

}
