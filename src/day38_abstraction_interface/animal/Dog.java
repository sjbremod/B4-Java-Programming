package day38_abstraction_interface.animal;
//concrete class / non - abstract class
public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dogs eat from bowl");
    }
}
