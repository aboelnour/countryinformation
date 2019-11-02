package com.flairstech.countryinformation.endpoint;

import com.flairstech.countryinformation.entities.Country;
import com.flairstech.countryinformation.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mohamed Aboelnour
 */
@RestController
public class CountryController {

    @Autowired
    CountryService Service;

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {
        return Service.getCountryInfo(code);
    }
}
