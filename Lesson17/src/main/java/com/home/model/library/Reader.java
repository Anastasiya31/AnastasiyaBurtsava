package com.home.model.library;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Reader {
    private String FIO;
    private EmailAddress emailAddress;
    private boolean consentNewsletter;
    private List<Book> books;

    @Override
    public String toString() {
        return "Читатель: " +
                "FIO ='" + FIO + '\'' +
                ", emailAddress = " + emailAddress +
                ", согласие на рассылку " + consentNewsletter +
                ", " + books;
    }
}
