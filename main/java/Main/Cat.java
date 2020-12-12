package Main;

import lombok.Getter;
import lombok.Setter;

public class Cat {
    @Getter
    @Setter

    private String name;
    private int mouseCounter;

    public Cat(String name) {
        this.name = name;
        this.mouseCounter = 0;
    }

    public void makeSound() {
        System.out.println(this.name + "miau");
    }

    public void eatMouse() {
        this.mouseCounter++;
        //  this.mouseCounter = this.mouseCounter +1;
    }

    public Cat(String name, int mouseCounter) {

    }
}
