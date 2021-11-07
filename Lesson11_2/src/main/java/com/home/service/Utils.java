package com.home.service;


import java.util.regex.Pattern;

public class Utils {


    public static boolean checkAuthorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (check(login)) {
            throw new WrongLoginException("Неверный логин");
        }
        if (check(password) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Неверный пароль");
        }
        return true;
    }

    public static boolean check(String string) {
        return !Pattern.matches("[a-z0-9_]+", string) || string.length() >= 20;
    }
}
