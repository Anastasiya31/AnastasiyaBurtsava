package home.tms.model.spaceport;

import java.util.Scanner;

public class SpaceX implements IStart {
    @Override
    public boolean preStartSystemCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Внимание! Для успешной проверки введите 1, для отмены ввдите 2");
        int n = sc.nextInt();
        if (n < 1 || n > 2) {
            System.out.println("Введите 1 или 2");
            n = sc.nextInt();
        }
        return n == 1;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");
    }
}
