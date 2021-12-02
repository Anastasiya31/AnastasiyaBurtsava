package com.home.model.library;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class EmailAddress {
    private String email;

    @Override
    public String toString() {
        return "EmailAddress{" +
                "email='" + email + '\'' +
                '}';
    }
}
