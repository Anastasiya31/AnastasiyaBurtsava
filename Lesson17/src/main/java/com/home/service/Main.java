package com.home.service;

import com.home.model.Car;
import com.home.model.Person;

import java.util.Arrays;
import java.util.List;

import static com.home.service.Utils.*;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));

        List<Person> persons = List.of(
                new Person("Иван", "Даааа"),
                new Person("Василий", "Апппп"),
                new Person("Анна", "Дппп"),
                new Person("Яна", "Пттт"),
                new Person("Настя", "Пммммм"));

        System.out.println(multiplication());
        System.out.println(countEvenNumbers());
        System.out.println(firstCapitalLetter());
        System.out.println(notEmptyCars(cars));
        System.out.println(surnamesStartWith(persons, "Д"));
        System.out.println(NumberEmployeesPerLetter(persons));
    }
}
