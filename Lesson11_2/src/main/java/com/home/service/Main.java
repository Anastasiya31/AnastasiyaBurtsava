package com.home.service;

import static com.home.service.Utils.checkAuthorization;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(checkAuthorization("hghhgjggh444_", "6067788nn", "667788nn"));
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
    }
}




