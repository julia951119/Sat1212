package Main;
// Sat 20201212

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("John");
        Cat cat2 = new Cat("Baby");
        Cat cat3 = new Cat("Lola");
        List<Cat> cats= new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        for (Cat cat: cats){
            cat.makeSound();
        }
Car car1 = new Car();
        car1.move();

    }
}
