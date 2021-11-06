package com.home.service;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkAuthorization("hghhgjggh444_", "6677988nn", "667788nn"));
    }

    public static boolean checkAuthorization(String login, String password, String confirmPassword) {
        try {
            if (Pattern.matches("[a-z0-9_]+", login) && login.length() < 20) {
                System.out.println(login);
            } else {
                throw new WrongLoginException();
            }
            if (Pattern.matches("[a-z0-9_]+", password) && password.length() < 20 && password.equals(confirmPassword)) {
                System.out.println(password);
                return true;
            } else {
                throw new WrongPasswordException();
            }
        } catch (WrongLoginException wrongLoginException) {
            System.out.println("Ввели неверный логин");
            return false;
        } catch (WrongPasswordException wrongPasswordException) {
            System.out.println("Ввели неверный пароль");
            return false;
        }
    }
}

