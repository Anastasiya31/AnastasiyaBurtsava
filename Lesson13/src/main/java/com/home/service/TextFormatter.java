package com.home.service;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFormatter {
    private TextFormatter() {
    }


    public static String getMiddleChars(String str) {
        String[] subStr = str.split(" ");
        ArrayList<String> arr = new ArrayList<>();
        for (String s : subStr) {
            arr.add(s.substring(s.length() / 2 - 1, s.length() / 2 + 1));

        }
        return String.valueOf(arr);
    }

    public static void getRegexCab(String str) {
        String regex2 = "c.+?b";
        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void getRegexJava(String str) {
        String regex = "(\\w{4})(\s+)([0-9]{1,2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void countLatin(String str) {
        String regex = "([а-яА-Я]{2,}) | ([0-9]{3,}) |([a-zA-Z]+\\d)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static boolean validate(String str) {
        String regex = "[a-z1|5]{4,20}";
        return str.matches(regex);
    }
}