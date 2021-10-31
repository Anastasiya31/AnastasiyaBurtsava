package home.tms.model.robot;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ToshibaHand implements IHand {
    private int priceHand;

    @Override
    public int price() {
        return priceHand;
    }

    @Override
    public String info() {
        return ", рука Toshiba";
    }
}
