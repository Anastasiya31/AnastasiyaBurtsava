package home.tms.model.robot;

public class SonyHand implements IHand {
    @Override
    public int price() {
        return 45;
    }

    @Override
    public String info() {
        return ", рука Sony";
    }

}
