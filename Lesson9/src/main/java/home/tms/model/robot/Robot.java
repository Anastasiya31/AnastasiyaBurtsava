package home.tms.model.robot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
public class Robot {

    private IHand iHand;
    private IHead iHead;
    private ILeg iLeg;


    public void action() {
        System.out.println("Появился робот - " + iHead.info() + iHand.info() + iLeg.info());
    }

    public String infoCost() {
        return "Самый дорогой робот, у которого - " + iHead.info() + iHand.info() + iLeg.info();

    }

    public int cost() {
        return iLeg.price() + iHead.price() + iHand.price();
    }

}
