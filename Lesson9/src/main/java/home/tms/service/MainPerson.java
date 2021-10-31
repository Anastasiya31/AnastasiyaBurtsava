package home.tms.service;

import home.tms.model.clothes.*;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Александр", new YellowJacket(), new BeigeTrousers(), new BeigeShoes());
        Person person2 = new Person("Иван", new GreenJacket(), new BeigeTrousers(), new YellowShoes());

        person1.getDressed();
        person2.getDressed();
        person1.unDressed();
        person2.unDressed();
    }
}
