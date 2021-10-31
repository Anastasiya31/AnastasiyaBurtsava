package home.tms.model.clothes;

public class GreenTrousers implements Trousers {
    @Override
    public String putOn() {
        return ", надел зелёные штаны";
    }

    @Override
    public String takeOff() {
        return ", снял зелёные штаны";
    }
}
