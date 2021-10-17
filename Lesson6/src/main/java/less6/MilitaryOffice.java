package less6;

import java.util.ArrayList;

public class MilitaryOffice {
    private ArrayList<Person> personRegistry;

    public MilitaryOffice(ArrayList<Person> personRegistry) {
        this.personRegistry = personRegistry;
    }


    @Override
    public String toString() {
        return "MilitaryOffice{" +
                "personRegistry=" + personRegistry +
                '}';
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

    public void ages() {
        int count = 0;
        for (Person person : personRegistry) {
            if (person.getAge() >= 25 && person.getAge() <= 27 && person.getSex().equals("male")) {
                count++;
            }
        }
        System.out.println("Возраст от 25 до 27: " + count);
        if (count == 0) {
            System.out.println("Возраст от 25 до 27 нет");
        }
    }

    public void alexandr() {
        int count = 0;
        for (Person person : personRegistry) {

            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getSex().equals("male") && person.getName() == "Александр") {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Александров нет");
        } else {
            System.out.println("С именем Александр " + count);
        }
    }

    public void minsk() {
        int count = 0;
        for (Person person : personRegistry) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getSex().equals("male") && person.getAdress().equals(new Adress("Belarus", "Minsk"))) {
                count++;
            }
        }
        System.out.println("В городе Минске: " + count);
    }
}
