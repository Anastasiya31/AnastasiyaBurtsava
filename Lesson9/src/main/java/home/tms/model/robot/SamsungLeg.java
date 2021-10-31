package home.tms.model.robot;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SamsungLeg implements ILeg {

    private int priceLeg;

    @Override
    public int price() {
        return priceLeg;
    }

    @Override
    public String info() {
        return ", нога Samsung";
    }
}
