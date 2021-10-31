package home.tms.model.spaceport;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Spaceport {
    private IStart iStart;

    public void start() {
        if (!iStart.preStartSystemCheck()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            System.out.println("Предстартовая проверка успешна ");
            iStart.startEngine();
            for (int i = 10; i > 0; i--) {
                System.out.println(i + " ");
            }
            iStart.start();
        }
    }
}
