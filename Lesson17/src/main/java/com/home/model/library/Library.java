package com.home.model.library;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void getBooks(List<Book> books) {
        books.sort(Comparator.comparing(Book::getYear));
        System.out.println(books);
    }

    public void subscription(List<Reader> readers) {
        List<EmailAddress> emailAddresses = readers.stream()
                .map(Reader::getEmailAddress)
                .collect(Collectors.toList());
        System.out.println(emailAddresses);
    }

    public void subscriptionConsentNewsletter(List<Reader> readers) {
        List<EmailAddress> emailAddresses = readers.stream()
                .filter(reader -> reader.isConsentNewsletter() && reader.getBooks().size() > 1)
                .map(Reader::getEmailAddress)
                .collect(Collectors.toList());
        System.out.println(emailAddresses);
    }

    public void getBooksByAuthor(List<Reader> readers) {
        boolean books = readers.stream()
                .anyMatch(reader -> reader.getBooks().toString().contains("Пушкин Александр Сергеевич"));
        System.out.println("Есть ли книги с данным автором " + books);
    }

    public void getBooksByReaders(List<Reader> readers) {
        Set<List<Book>> books = readers.stream()
                .map(Reader::getBooks).collect(Collectors.toSet());
        System.out.println(books);
    }

    public void getMaxBooks(List<Reader> readers) {
        Integer maxBooks = readers.stream()
                .map(reader -> reader.getBooks().size())
                .max(Comparator.comparingInt(Integer::byteValue))
                .orElse(null);
        System.out.println("Максимальное количество книг = " + maxBooks);
    }

    public List<EmailAddress> getEmailAddressLessTwo(List<Reader> readers) {
        return readers.stream()
                .filter(reader -> reader.isConsentNewsletter() && reader.getBooks().size() <= 2)
                .map(Reader::getEmailAddress)
                .collect(Collectors.toList());
    }

    public List<EmailAddress> getEmailAddressMoreTwo(List<Reader> readers) {
        return readers.stream()
                .filter(reader -> reader.isConsentNewsletter() && reader.getBooks().size() > 2)
                .map(Reader::getEmailAddress)
                .collect(Collectors.toList());
    }

    public void getEmails(List<Reader> readers) {
        List<Reader> reader = readers.stream()
                .filter(reader1 -> getEmailAddressLessTwo(readers).toString().contains(reader1.getEmailAddress().toString()))
                .collect(Collectors.toList());

        List<Reader> reader2 = readers.stream()
                .filter(reader1 -> getEmailAddressMoreTwo(readers).toString().contains(reader1.getEmailAddress().toString()))
                .collect(Collectors.toList());

        System.out.println("OK: " + getEmailAddressLessTwo(readers));
        System.out.println("Группа читателей OK: " + reader);
        System.out.println("TOO_MUCH: " + getEmailAddressMoreTwo(readers));
        System.out.println("Группа читателей TOO_MUCH: " + reader2);
    }

    public void getFIOByEmails(List<Reader> readers) {
        String reader = readers.stream()
                .filter(reader1 -> getEmailAddressLessTwo(readers).toString().contains(reader1.getEmailAddress().toString()))
                .map(Reader::getFIO)
                .collect(Collectors.joining(", "));

        String reader2 = readers.stream()
                .filter(reader1 -> getEmailAddressMoreTwo(readers).toString().contains(reader1.getEmailAddress().toString()))
                .map(Reader::getFIO)
                .collect(Collectors.joining(", "));

        System.out.println("ФИО читателей OK: {" + reader + "}");
        System.out.println("ФИО читателей TOO_MUCH: {" + reader2 + "}");
    }
}
