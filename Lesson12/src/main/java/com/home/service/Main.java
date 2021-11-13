package com.home.service;

import static com.home.service.TextFormatter.*;

public class Main {
    public static void main(String[] args) {
        String str = "ghkkmsknckkxssh";
        String text =
                "Знакомьтесь с моом семьей. Нас пятеро – мои родители, мом старший брат, моя маленькая сестра и я. Сначала познакомьтесь с моими мамой и папой, Джейн и Майклом. Моя мама любит читать, а мой папа любит играть в шахматы с моим братом Кеном. Моя мама стройная. У нее длинные рыжие волосы. И большие карие глаза. У нее очень приятная улыбка и нежный голос. Моя мама очень добрая и понимающая ";

        System.out.println(str.substring(str.indexOf('h'), str.lastIndexOf('s') + 1));
        System.out.println(str.replace(str.charAt(3), str.charAt(0)));
        System.out.println(getPalindromes(new String[]{"Winter", "Spring", "summus", "Autumn", "esummuse", "summus"}));
        System.out.println(formatText(text));
    }
}
