package home.tms.model.robot;

public class SamsungHead implements IHead {
    @Override
    public int price() {
        return 100;
    }

    @Override
    public String info() {
        return " Голова Samsung";
    }

}
