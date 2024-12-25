package day31_custom_classes;

public class UsingCoffee {
    public static void main(String[] args) {

        Coffee coffee1 = new Coffee();

        //if we have toString<> method not declared, it will print memory location
        //if we have it declared we can print the object and it will call toString by default
        System.out.println(coffee1);

        // lets assign values to those instance variables

       // we need object reference to call the instance variable and then assign values
        coffee1.price = 3.99;
        coffee1.sizeInOz =16.0 ;
        coffee1.brand = "starbucks";
        coffee1.type = "black";

        System.out.println(coffee1);

        // call your custom instance method

        coffee1.drink();
        coffee1.refill(2.0);
        System.out.println(coffee1.sizeInOz);
        System.out.println("------------");
        Coffee coffee2 = new Coffee();
        System.out.println(coffee2);
        coffee2.drink();

        coffee2.refill(10);
        System.out.println(coffee2);



    }
}
