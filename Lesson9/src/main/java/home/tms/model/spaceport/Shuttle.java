package home.tms.model.spaceport;

public class Shuttle implements IStart {

    @Override
    public boolean preStartSystemCheck() {
        int a = (int) (Math.random() * 10);
        return a > 3;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
