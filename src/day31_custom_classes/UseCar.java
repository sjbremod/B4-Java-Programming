package day31_custom_classes;

public class UseCar {
    public static void main(String[] args) {

    Car car1 = new Car();
    car1.model = "tesla";
    car1.year = 2024;
    car1.color = "silver";
    car1.fuelLevel = 50;
        System.out.println(car1);

        System.out.println();
        car1.drive();
        car1.drive();
        System.out.println(car1.fuelLevel);

        car1.fillTank();
        System.out.println(car1.fuelLevel);

        System.out.println();
        System.out.println(car1);

        System.out.println(car1.isFuelLevelLow());


    }
}
