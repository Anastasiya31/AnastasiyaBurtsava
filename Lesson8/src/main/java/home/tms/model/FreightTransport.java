package home.tms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class FreightTransport extends GroundTransport {
    private int loadCapacity;

    @Override
    public String info() {
        return super.info() + ",\nгрузоподъёмность - " + loadCapacity + "(т)";
    }

    public void checkCapacity(double ton) {
        if (ton <= loadCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
