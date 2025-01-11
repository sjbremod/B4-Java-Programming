package day39_a_polymorphism.cloth;

public class Store {
    public static void main(String[] args) {

        // all possible reference of Tshirt

        //1 itself
        Tshirt t1 = new Tshirt();
        t1.wearClothes();


        //2 - parent class
        Clothes t2 = new Tshirt();
        t2.wearClothes();


        System.out.println("-------------");
        //all possible ref of jacket
        //1 itslef

        Jacket j1 = new Jacket();
        j1.wearClothes();
        j1.putOnHood();

        //2 - parent
        Clothes j2 = new Jacket();
        j2.wearClothes();



        //3 interface (which is implement this jacket class)
        HasHood j3 = new Jacket();
        j3.putOnHood();

        //4
        Object j4 = new Jacket();

        System.out.println("************************");

        Tshirt tshirt = new Tshirt();
        //ref can be itslef and parent

        buy(tshirt);
        buy(new Tshirt());


        Jacket jacket = new Jacket();
        // possible ref : itself, parent, interface

        buy(jacket);
//        buy(new Jacket());



//        test(1);
//        test2("hello" );
//        test2(new String("hello"));


    }

//    Clothes clothes = new TShirt():
//    Clothes clothes = new Jacket():
    public static void buy (Clothes clothes) {

        if (clothes instanceof Clothes) {
            }

        if (clothes instanceof Tshirt) {
                System.out.println("Bought a Tshirt");
            }else if (clothes instanceof Jacket) {
                System.out.println("Bought a Jacket");
            }
        }

    public static void test(double d){

    }
    public static void test2(String s) {

    }
}


