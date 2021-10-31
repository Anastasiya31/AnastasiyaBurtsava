package home.tms.service;

import home.tms.model.robot.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainRobots {
    public static void main(String[] args) {
        Robot robot1 = new Robot(new SamsungHand(100), new SonyHead(83), new ToshibaLeg(84));
        Robot robot2 = new Robot(new SonyHand(79), new SonyHead(83), new SamsungLeg(99));
        Robot robot3 = new Robot(new ToshibaHand(82), new SamsungHead(66), new ToshibaLeg(49));

        robot1.action();
        robot2.action();
        robot3.action();

        List<Robot> robots = new ArrayList<>();
        robots.add(robot1);
        robots.add(robot2);
        robots.add(robot3);

        Robot max = Collections.max(robots, Comparator.comparingInt(Robot::cost));

        System.out.println(max.infoCost() + ", со стоимостью = " + max.cost());

    }
}
