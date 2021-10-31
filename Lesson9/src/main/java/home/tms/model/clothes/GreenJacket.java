package home.tms.model.clothes;

public class GreenJacket implements Jacket {
    @Override
    public String putOn() {
        return ", надел зелёную куртку";
    }

    @Override
    public String takeOff() {
        return ", снял зелёную куртку";
    }
}
