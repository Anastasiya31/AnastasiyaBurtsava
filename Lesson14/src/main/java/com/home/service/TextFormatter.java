package com.home.service;

import java.util.ArrayList;

public class TextFormatter {

    private TextFormatter() {
    }

    public static String getPalindromes(String str) {
        String[] sentences = str.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String s : sentences) {
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
            int count = getArray(sentence).length;
            if (count >= 3 && count <= 5 || checkPalindromeInSentence(sentence)) {
                arr.add(sentence);
            }
        }
        return String.valueOf(arr).replaceAll("-\\s*", "");
    }

    public static void checkCensor(String text, String text2) {
        if (censorWords(text, text2)) {
            String[] sentences = text.split("[.!?]\\s*");
            String[] words = text2.split("\\s+");
            int count = 0;
            for (String sentence : sentences) {
                for (String word : words) {
                    if (sentence.contains(word)) {
                        System.out.println(sentence);
                        count++;
                    }
                }
            }
            System.out.println("Количество предложений не прошедших цензуру = " + count);
        } else {
            System.out.println("Текст прошёл цензуру");
        }
    }

    public static boolean censorWords(String text, String text2) {
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (text2.contains(word)) {
                return true;
            }
        }
        return false;
    }

    public static String[] getArray(String str) {
        return str.split(" ");
    }

    public static boolean checkPalindromeInSentence(String str) {
        for (String s : getArray(str)) {
            if (s.length() > 2 && s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}
