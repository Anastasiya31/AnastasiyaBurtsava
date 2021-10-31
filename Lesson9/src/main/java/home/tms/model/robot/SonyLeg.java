package home.tms.model.robot;

public class SonyLeg implements ILeg {

    @Override
    public int price() {
        return 70;
    }

    @Override
    public String info() {
        return ", нога Sony";
    }
}
