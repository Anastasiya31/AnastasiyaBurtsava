package home.tms.model.robot;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ToshibaHead implements IHead {
    private int priceHead;

    @Override
    public int price() {
        return priceHead;
    }

    @Override
    public String info() {
        return " голова Toshiba";
    }

}
