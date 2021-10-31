package home.tms.model.clothes;

public class YellowJacket implements Jacket {

    @Override
    public String putOn() {
        return ", надел жёлтую куртку";
    }

    @Override
    public String takeOff() {
        return ", снял жёлтую куртку";
    }
}
