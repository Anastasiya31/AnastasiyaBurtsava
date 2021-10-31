package home.tms.model.spaceport;

import java.util.Scanner;

public class Orbital implements IStart {
    @Override
    public boolean preStartSystemCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Внимание! Введите число от 1 до 10");
        int n = sc.nextInt();
        return n >= 1 && n <= 10;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Orbital запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Orbital");
    }
}
