package home.tms.service;

import home.tms.model.spaceport.Orbital;
import home.tms.model.spaceport.Shuttle;
import home.tms.model.spaceport.SpaceX;
import home.tms.model.spaceport.Spaceport;

public class MainSpaceport {
    public static void main(String[] args) {
        Spaceport spaceport1 = new Spaceport(new Shuttle());
        Spaceport spaceport2 = new Spaceport(new SpaceX());
        Spaceport spaceport3 = new Spaceport(new Orbital());

        spaceport1.start();
        spaceport2.start();
        spaceport3.start();
    }
}
