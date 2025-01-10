package day38_b_polymophism.animal;

public class Reptile extends Animal {
    int numberOfLegs;

    @Override
    public void eat() {
        System.out.println("reptile eating...");;
    }
}
