package less6;

import java.util.ArrayList;

public class MilitaryOffice {
    private ArrayList<Person> personRegistry;

    public MilitaryOffice(ArrayList<Person> personRegistry) {
        this.personRegistry = personRegistry;
    }

    protected void armipotent() {
        int count = 0;
        for (Person person : personRegistry) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getSex().equals("male")) {
                count++;
                System.out.println("Годный: " + person.getName());
            }
        }
        if (count == 0) {
            System.out.println("Годных нет");
        }
    }

    public int ages() {
        int count = 0;
        for (Person person : personRegistry) {
            if (person.getAge() >= 25 && person.getAge() <= 27 && person.getSex().equals("male")) {
                count++;
            }
        }
        return count;
    }

    public int alexandr() {
        int count = 0;
        for (Person person : personRegistry) {

            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getSex().equals("male") && person.getName().equals("Александр")) {
                count++;
            }
        }
        return count;
    }

    public int minsk() {
        int count = 0;
        for (Person person : personRegistry) {
            Adress addr = person.getAdress();
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getSex().equals("male") && addr.getCity().equals("Minsk")) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "MilitaryOffice " +
                "personRegistry=" + personRegistry;
    }
}
