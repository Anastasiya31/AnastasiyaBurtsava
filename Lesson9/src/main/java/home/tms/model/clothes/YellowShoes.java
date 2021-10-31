package home.tms.model.clothes;

public class YellowShoes implements Shoes {

    @Override
    public String putOn() {
        return ", надел жёлтую обувь";
    }

    @Override
    public String takeOff() {
        return ", снял жёлтую обувь";
    }
}
