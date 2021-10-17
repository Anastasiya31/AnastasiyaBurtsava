package less6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personRegistry = new ArrayList<>();
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);

        personRegistry.add(new Person("Ann", 14, "female", new Adress("Belarus", "Minsk")));
        personRegistry.add(new Person("Иван", 18, "male", new Adress("Belarus", "Minsk")));
        personRegistry.add(new Person("Александр", 21, "male", new Adress("Belarus", "Vitebsk")));
        personRegistry.add(new Person("Андрей", 27, "male", new Adress("Belarus", "Minsk")));
        personRegistry.add(new Person("Ирина", 14, "female", new Adress("Belarus", "Minsk")));
        personRegistry.add(new Person("Александр", 25, "male", new Adress("Belarus", "Grodno")));
        personRegistry.add(new Person("Егор", 14, "male", new Adress("Belarus", "Minsk")));

        militaryOffice.armipotent();
        militaryOffice.ages();
        militaryOffice.alexandr();
        militaryOffice.minsk();
    }
}
