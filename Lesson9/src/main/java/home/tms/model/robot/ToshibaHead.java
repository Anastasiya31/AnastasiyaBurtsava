package home.tms.model.robot;

public class ToshibaHead implements IHead {

    @Override
    public int price() {
        return 80;
    }

    @Override
    public String info() {
        return " голова Toshiba";
    }

}
