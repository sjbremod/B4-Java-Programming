package day39_a_polymorphism.cloth;

public class Jacket extends Clothes implements HasHood{


    @Override
    public void wearClothes() {
        System.out.println("wearing jacket..");
    }

    @Override
    public void putOnHood() {
        System.out.println("putting on  Jacket's hoody..");
    }


}
