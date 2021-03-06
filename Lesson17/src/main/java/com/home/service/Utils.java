package com.home.service;


import com.home.model.Car;
import com.home.model.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Utils {

    private Utils() {
    }

    public static List<Integer> multiplication() {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 10);
            list1.add(a);
        }
        System.out.println(list1);
        return list1.stream().map(i -> i * 2)
                .collect(Collectors.toList());
    }

    public static int countEvenNumbers() {
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < 50; i++) {
            int a = (int) (Math.random() * 100);
            list.add(a);
        }
        System.out.println(list);
        int x = (int) (list.stream()
                .filter((n) -> n % 2 == 0))
                .count();
        System.out.println("Количество чётных чисел = ");
        return x;
    }

    public static String firstCapitalLetter() {
        ArrayList<String> list = new ArrayList<>();
        list.add("john");
        list.add("arya");
        list.add("sansa");
        return (list.stream()
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining(", ")));
    }

    public static List<Car> notEmptyCars(List<Car> cars) {
        return cars.stream()
                .filter(p -> p.getYear() > 2010 && p.getNumber() != null && !Objects.equals(p.getNumber(), ""))
                .collect(Collectors.toList());
    }

    public static Optional<String> surnamesStartWith(List<Person> persons) {
        return Optional.ofNullable(persons.stream()
                .filter(p -> p.getSurname().startsWith("Д"))
                .collect(Collectors.toList())
                .toString());
    }

    public static Map<String, Long> employeesPerLetter(List<Person> persons) {
        return persons.stream()
                .collect(Collectors.groupingBy(person -> person.getSurname().substring(0, 1),
                        Collectors.counting()));
    }
}
