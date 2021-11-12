package com.home.service;

public class TextFormatter {

    private TextFormatter() {
    }

    public static void palindromeMass(String[] str) {
        for (String s : str) {
            if ((s.equals(new StringBuilder(s).reverse().toString()))) {
                System.out.println(s);
            }
        }
    }

    public static void formatText(String text) {
        String[] sentences = text.split("[.!?]\\s*");
        for (String sentence : sentences) {
            if (countWords(sentence) >= 3 && countWords(sentence) <= 5) {
                System.out.println(sentence);
            }
        }
        for (String sentence : sentences) {
            if (palindrome(sentence)) {
                System.out.println(sentence);
            }
        }
    }

    public static int countWords(String str) {
        int count = 0;
        if (str.length() != 0) {
            count++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean palindrome(String str) {
        String[] subStr = str.split(" ");
        for (String s : subStr) {
            if (s.length() > 1 && s.equals(new StringBuilder(s).reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}
