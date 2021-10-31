package home.tms.model.clothes;

public class BeigeTrousers implements Trousers {
    @Override
    public String putOn() {
        return ", надел бежевые штаны";
    }

    @Override
    public String takeOff() {
        return ", снял бежевые штаны";
    }
}
