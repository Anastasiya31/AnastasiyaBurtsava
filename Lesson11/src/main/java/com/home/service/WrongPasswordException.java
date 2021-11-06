package com.home.service;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WrongPasswordException extends Exception {

    public WrongPasswordException(String message) {
        super(message);
    }
}
