package home.tms.model.robot;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SonyHead implements IHead {
    private int priceHead;

    @Override
    public int price() {
        return priceHead;
    }

    @Override
    public String info() {
        return " Голова Sony";
    }


}
