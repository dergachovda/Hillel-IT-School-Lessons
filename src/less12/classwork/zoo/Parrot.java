package less12.classwork.zoo;

import less12.classwork.zoo.Animal;

public class Parrot extends Animal {

    Parrot() {
        name = "Blue Parrot";
        age = 6;
        weight = 1;
    }

    public void voice() {
        System.out.println("Parrot!");
    }

    public boolean canFly() {
        return true;
    }

}
