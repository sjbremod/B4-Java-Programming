package day37_a_abstraction.car;

public class Tesla extends ElectricCar {

    public void start (){
        System.out.println("Tesla is starting with phone");
    }

    @Override
    public void charge() {
        System.out.println("Tesla is charging");
    }
}
