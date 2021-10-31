package home.tms.model.clothes;

public class BeigeJacket implements Jacket {
    @Override
    public String putOn() {
        return ", надел бежевую куртку";
    }

    @Override
    public String takeOff() {
        return ", снял бежевую куртку";
    }
}
