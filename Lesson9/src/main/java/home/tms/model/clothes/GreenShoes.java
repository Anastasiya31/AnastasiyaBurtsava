package home.tms.model.clothes;

public class GreenShoes implements Shoes {
    @Override
    public String putOn() {
        return ", надел зелёную обувь";
    }

    @Override
    public String takeOff() {
        return ", снял зелёную обувь";
    }
}
