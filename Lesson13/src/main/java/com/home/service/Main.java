package com.home.service;

import static com.home.service.TextFormatter.*;
import static com.home.service.TextFormatter.validate;

public class Main {
    public static void main(String[] args) {

        System.out.println(getMiddleChars("zxcvbn jgkg gkhlhg"));
        getRegexCab("cab, ccab, cccab");
        getRegexJava("Versions: Java  5, Java 6, Java   7, Java 8, Java 12.");

        String str = "One two three раз два три one1 two2 123 ";
        System.out.println(str.split("([a-zA-Z]{3,})(\s+)").length);
        countLatin("One two three раз два три one1 vvvvv two2 123 ");
        System.out.println(validate("sa11arsfdddd5rere5"));
        System.out.println(validate("sa11a2rsfdddd5rere5"));
    }
}
