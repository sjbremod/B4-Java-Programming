package day36_inheritance.final_example;

public class UseFinalExample {
    public static void main(String[] args) {

        FinalExample obj1 = new FinalExample(10);
        System.out.println(obj1.a);
        //obj1.a = 10;// cant change it because its final
        System.out.println(obj1.b);
        System.out.println(FinalExample.PLANET);
        //FinalExample.PLANET = "mars"// cant do this bc its final
        System.out.println(FinalExample.NUMBER_OF_EARTH_PLANETS);

        System.out.println("---------------");
        FinalExample obj2 = new FinalExample(20);
        System.out.println(obj1.PLANET);
        System.out.println(obj2.PLANET);



    }
}
