package home.tms.model.robot;

public class ToshibaHand implements IHand {

    @Override
    public int price() {
        return 90;
    }

    @Override
    public String info() {
        return ", рука Toshiba";
    }
}
