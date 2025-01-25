package day38_abstraction_interface.shopping;

import day36_inheritance.static_hide.A;

public class Runner {
    public static void main(String[] args) {


    Target t = new Target();
    t.buyItem();
    t.returnItem();
        System.out.println(t.price);

        System.out.println("------------------");
    Amazon a =new Amazon();
    a.buyItem();
    a.returnItem();
    System.out.println(a.price);
        System.out.println(Amazon.COUNTRY);
        a.deliveryEstimate();
        a.shippingCost(true);

        System.out.println("------------------");

        System.out.println(Shipping.COUNTRY);
        System.out.println(Amazon.COUNTRY);



    }
}
