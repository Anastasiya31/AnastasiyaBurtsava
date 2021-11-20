package com.home.service;

import java.util.ArrayList;

public class TextFormatter {

    private TextFormatter() {
    }

    public static String getPalindromes(String[] str) {
        StringBuilder result = new StringBuilder();
        for (String s : str) {
            if ((s.equals(new StringBuilder(s).reverse().toString()))) {
                result.append(s).append("\n");
            }
        }
        return result.toString();
    }

    public static String formatText(String text) {
        String[] sentences = text.split("[.!?]\\s*");
        ArrayList<String> arr = new ArrayList<>();
        for (String sentence : sentences) {
            int count = countWords(sentence);
            if (count >= 3 && count <= 5 || checkPalindromeInSentence(sentence)) {
                arr.add(sentence);
            }
        }
        return String.valueOf(arr);
    }

    public static int countWords(String str) {
        String[] mass = str.split(" ");
        return mass.length;
    }

    public static boolean checkPalindromeInSentence(String str) {
        String[] subStr = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String s : subStr) {
            if (s.length() > 2 && s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}
