package com.bookings.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class InvalidCredentialsException extends ResponseStatusException {
    public InvalidCredentialsException(){
        super(HttpStatus.UNAUTHORIZED, "Invalid username or password");
    }
}

