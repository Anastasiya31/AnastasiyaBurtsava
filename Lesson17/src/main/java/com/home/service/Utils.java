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
        list1 = list1.stream().map(i -> i * 2).collect(Collectors.toList());
        return list1;
    }

    public static int countEvenNumbers() {
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < 50; i++) {
            int a = (int) (Math.random() * 100);
            list.add(a);
        }
        System.out.println(list);
        int x = (int) (list.stream().filter((n) -> (n % 2) == 0)).count();
        System.out.println("Количество чётных чисел = ");
        return x;
    }

    public static String firstCapitalLetter() {
        ArrayList<String> list = new ArrayList<>();
        list.add("john");
        list.add("arya");
        list.add("sansa");
        return (list.stream().map(w -> Character.toUpperCase(w.charAt(0)) + w.substring(1)).collect(Collectors.joining(", ")));
    }

    public static List<Car> notEmptyCars(List<Car> cars) {


        return cars.stream().
                filter(p -> p.getYear() > 2010 && p.getNumber() != null && !Objects.equals(p.getNumber(), "")).collect(Collectors.toList());
    }

    public static Optional<String> surnamesStartWith(List<Person> persons, String letter) {
        return Optional.of(persons.stream().
                filter(p -> p.getSurname().startsWith(letter)).collect(Collectors.toList()).toString());
    }

    public static ArrayList<String> NumberEmployeesPerLetter(List<Person> persons) {
        Set<Character> firstChar = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();
        for (Person person : persons) {
            firstChar.add(person.getSurname().charAt(0));
        }
        for (Character character : firstChar) {
            int count = (int) persons.stream().filter(n -> n.getSurname().charAt(0) == character).count();
            result.add(character + "-" + count + " сотрудников");
        }
        return result;
    }
}
