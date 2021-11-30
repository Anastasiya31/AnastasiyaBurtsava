package com.home.model.library;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Book {
    private String author;
    private String name;
    private int year;

    @Override
    public String toString() {
        return "Книга: " +
                "автор - " + author +
                ", название - " + name +
                ", год издания - " + year +
                '.';
    }

}
