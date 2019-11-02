package com.flairstech.countryinformation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Mohamed Aboelnour
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class CountryNotFoundException extends RuntimeException {

    public CountryNotFoundException(String msg) {
        super(msg);
    }
}
