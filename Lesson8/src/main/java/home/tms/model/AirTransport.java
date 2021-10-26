package home.tms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class AirTransport extends Transport {
    private int wingspan;
    private int minRunwayLengthForTakeoff;

    @Override
    public String info() {
        return super.info() + ",\nРазмах крыльев = " + wingspan + "(м), минимальная длина взлётно-посадочной полосы для взлёта = " + minRunwayLengthForTakeoff;
    }
}
