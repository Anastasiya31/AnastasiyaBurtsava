package home.tms.model.clothes;

public class YellowTrousers implements Trousers {

    @Override
    public String putOn() {
        return ", надел жёлтые штаны";
    }

    @Override
    public String takeOff() {
        return ", снял жёлтые штаны";
    }
}
