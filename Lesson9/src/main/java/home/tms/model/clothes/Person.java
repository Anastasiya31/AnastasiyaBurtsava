package home.tms.model.clothes;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person {
    private String name;
    private Jacket jacket;
    private Trousers trousers;
    private Shoes shoes;

    public void getDressed() {
        System.out.println(name + jacket.putOn() + trousers.putOn() + shoes.putOn());
    }

    public void unDressed() {
        System.out.println(name + jacket.takeOff() + trousers.takeOff() + shoes.takeOff());
    }
}
