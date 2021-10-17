package less6;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
