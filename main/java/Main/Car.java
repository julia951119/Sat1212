package Main;

public class Car implements Movable{
    private Main.Car car1;

    @Override
    public String move(){
        System.out.println("I am driving home");
        return "Jade";


    }
}
