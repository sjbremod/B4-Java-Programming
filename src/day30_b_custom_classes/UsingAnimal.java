package day30_b_custom_classes;
//runner class

public class UsingAnimal {
    public static void main(String[] args) {

        Animal animal1 = new Animal();

        System.out.println(animal1.population);
        System.out.println(new Animal().population);
        System.out.println(new Animal().species);// this ovject is not the same as about

        animal1.species = "bird";
        animal1.population = 1000000;
        System.out.println(animal1.species);
        System.out.println(animal1.population);

        System.out.println("**********************");
        System.out.println(animal1.toString());
        System.out.println(animal1);// this will call toString() method

        System.out.println();
        Animal animal2 = new Animal();
        System.out.println(animal2);

    }
}
