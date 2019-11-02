package com.flairstech.countryinformation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author MohamedAboelnour
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class DBConnectionException extends RuntimeException {

    public DBConnectionException(String msg) {
        super(msg);
    }
}
