package home.tms.model.robot;

public class SamsungHand implements IHand {

    @Override
    public int price() {
        return 50;
    }

    @Override
    public String info() {
        return ", рука Samsung";
    }
}
