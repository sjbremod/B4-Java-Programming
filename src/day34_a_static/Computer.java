package day34_a_static;
// template class - define the instruction or set of rules
public class Computer {

    //instance variables - each object has each own set of copy

    String brand;
    String color;
    double price;

    //static variables - each object shares the same copy

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    // static block - initializer for static variables

    static {
        System.out.println("running static block");
        hasScreen = false;
        hasBattery = true;
        hasMemory = true;

    }

    // constructor initializer for instance variables


    public Computer(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", hasScreen =" + hasScreen+

                ", hasBattery =" + hasBattery+
                ", hasMemory =" + hasMemory+
                '}';
    }
}
