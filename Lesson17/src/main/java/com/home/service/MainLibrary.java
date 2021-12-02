package com.home.service;

import com.home.model.library.Book;
import com.home.model.library.EmailAddress;
import com.home.model.library.Library;
import com.home.model.library.Reader;

import java.util.Arrays;
import java.util.List;

public class MainLibrary {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Пушкин Александр Сергеевич", "Капитанская дочка", 1836),
                new Book("Лермонтов", "Мцыри", 1830),
                new Book("Риордан", "Перси", 2008),
                new Book("Брэдбери", "451 градус", 1953),
                new Book("Роулинг", "Гарри Поттер", 1996)
        );

        List<Reader> readers = Arrays.asList(
                new Reader("Иванов Иван", new EmailAddress("aaaaaaa"), true, books.subList(1, 5)),
                new Reader("Петров Даниил", new EmailAddress("ffrrf"), false, books.subList(2, 4)),
                new Reader("Иванова Анна", new EmailAddress("yyyfff"), true, books.subList(1, 2)),
                new Reader("Кот Дарья", new EmailAddress("vbvbvbvbbv"), false, books.subList(0, 3)),
                new Reader("Сидоров Олег", new EmailAddress("vvvvvvv"), true, books.subList(3, 5)),
                new Reader("Титов Павел", new EmailAddress("hfhfhf"), true, books.subList(1, 3)),
                new Reader("Васильев Василий", new EmailAddress("ffrrf"), true, books.subList(3, 4))

        );

        Library library = new Library(books);

        library.getBooks(books);
        System.out.println("-----------------");
        library.subscription(readers);
        System.out.println("-----------------");
        library.subscriptionConsentNewsletter(readers);
        System.out.println("-----------------");
        library.getBooksByAuthor(readers);
        System.out.println("-----------------");
        library.getBooksByReaders(readers);
        System.out.println("-----------------");
        library.getMaxBooks(readers);
        System.out.println("-----------------");
        library.getEmails(readers);
        System.out.println("-----------------");
        library.getFIOByEmails(readers);
    }
}
