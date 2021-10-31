package home.tms.service;

import home.tms.model.robot.*;

public class MainRobots {
    public static void main(String[] args) {
        Robot robot1 = new Robot(new SamsungHand(), new SonyHead(), new ToshibaLeg());
        Robot robot2 = new Robot(new SonyHand(), new SonyHead(), new SamsungLeg());
        Robot robot3 = new Robot(new ToshibaHand(), new SamsungHead(), new ToshibaLeg());

        robot1.action();
        robot2.action();
        robot3.action();

        if (robot1.cost() > robot2.cost() && robot1.cost() > robot3.cost()) {
            System.out.println("Робот 1 самый дорогой");
        } else if (robot2.cost() > robot1.cost() && robot2.cost() > robot3.cost()) {
            System.out.println("Робот 2 самый дорогой");
        } else {
            System.out.println("Робот 3 самый дорогой");
        }
    }
}
