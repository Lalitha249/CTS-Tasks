package com.cognizant.spring_learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.spring_learn.model.Country;
@RestController
public class CountryController {
@GetMapping("/country")
public Country getCountry()
{
	 new Country("IN","India");
	return new Country("US","United States");
}

@GetMapping("/countries/{code}")
public Country getCountry(@PathVariable String code) {

    if(code.equalsIgnoreCase("IN"))
        return new Country("IN","India");

    if(code.equalsIgnoreCase("US"))
        return new Country("US","United States");

    return new Country("NA","Not Found");

}
}

