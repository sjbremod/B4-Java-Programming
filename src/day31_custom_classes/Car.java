package day31_custom_classes;

public class Car {
        // instance variables or fields
    String model;
    int year;
    String color;
    double fuelLevel;


    public String toString() {
        return "Car info:" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", fuelLevel=" + fuelLevel +
                '}';


    }
    public void drive (){
        System.out.println("driving "+model);
        fuelLevel -= 5;

    }

    public void fillTank(){
        System.out.println("filling tank");
        fuelLevel = 100;

    }

    public boolean isFuelLevelLow(){

        return fuelLevel <25;

    }

}
