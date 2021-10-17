package less6;

public class Adress {
    private String country;
    private String city;

    public Adress(String country, String city) {
        this.country = country;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address: " +
                "country='" + country + '\'' +
                ", city='" + city;
    }
}
