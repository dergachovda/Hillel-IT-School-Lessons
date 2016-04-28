package less12.classwork.zoo;

import less12.classwork.zoo.Animal;
import less12.classwork.zoo.Cat;
import less12.classwork.zoo.Dog;
import less12.classwork.zoo.Parrot;

public class Zoo2 {

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Parrot();
        animals[3] = new Dog();
        animals[4] = new Cat();

        for (Animal animal : animals) {
            animal.voice();
        }
    }

}