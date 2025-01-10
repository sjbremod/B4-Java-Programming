package day38_abstraction_interface.animal;

import day37_a_abstraction.language.Language;

public class Parrot extends Bird implements Flyable, Language {

    @Override
    public void eat() {
        System.out.println("Bird is eating");

    }
    @Override
    public void useWings() {
        System.out.println("Parrot has wing");
    }

    @Override
    public void fly() {

    }

    @Override
    public void sayHello() {
        System.out.println("Gu Gu");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Du DU");
    }
}
