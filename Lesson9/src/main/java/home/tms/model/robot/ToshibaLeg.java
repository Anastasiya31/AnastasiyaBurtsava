package home.tms.model.robot;

public class ToshibaLeg implements ILeg {
    @Override
    public int price() {
        return 55;
    }

    @Override
    public String info() {
        return ", нога Toshiba";
    }
}
