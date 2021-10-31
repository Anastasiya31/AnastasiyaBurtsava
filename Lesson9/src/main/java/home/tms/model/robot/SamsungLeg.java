package home.tms.model.robot;

public class SamsungLeg implements ILeg {

    @Override
    public int price() {
        return 76;
    }

    @Override
    public String info() {
        return ", нога Samsung";
    }
}
