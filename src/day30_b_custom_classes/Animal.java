package day30_b_custom_classes;
// template class
public class Animal {

    //instance variables
    String species;
    long population;


    //this is a special method
    // this method will help us to print the object directly.
    // if this method is not declared and you print your object directly it will show memory location
    public String toString (){

        String message = "Species: "+ species + "\nPopulation: "+ population;
        return message;
    }


}
