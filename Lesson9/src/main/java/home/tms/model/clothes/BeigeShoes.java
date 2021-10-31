package home.tms.model.clothes;

public class BeigeShoes implements Shoes {
    @Override
    public String putOn() {
        return ", надел бежевую обувь";
    }

    @Override
    public String takeOff() {
        return ", снял бежевую обувь";
    }
}
