package home.tms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class MilitaryTransport extends AirTransport {
    private int numberMissilesOnBoard;
    private boolean existenceEjectionSystem;


    @Override
    public String info() {
        return super.info() + ",\nкол-во ракет на борту = " + numberMissilesOnBoard + ", наличие системы катапультирования = " + existenceEjectionSystem;
    }

    public void shot() {
        if (numberMissilesOnBoard > 0) {
            System.out.println("Ракета пошла...");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void ejection() {
        if (existenceEjectionSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
