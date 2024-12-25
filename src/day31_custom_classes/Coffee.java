package day31_custom_classes;

public class Coffee {
        // instance variables - each object has its own copy
    double price;
    double sizeInOz;
    String brand;
    String type;

    public void drink(){
        System.out.println("drinking "+ type + " type of coffee");
    }

    public void refill(double addOz){
        System.out.println("refilling " +addOz + " oz");
        sizeInOz += addOz;
    }


    @Override
    public String toString() {
        return "Coffee{" +
                  "price: " + price +
                ", sizeInOz=" + sizeInOz +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                '}';



    }
}
