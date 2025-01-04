package day36_inheritance.final_example;

public class FinalExample {
    //instance variables
   // final int z; //if something is final it has to have an initial value either directly or through constructor
    final int a = 5; // since it its final and has a value its good
    final int b ; // since it is final and value is given through constructor this is ok


    //static variables
   // static final double PI; // this never gets initiallized
   public static final String PLANET = "Earth";
   public static final int NUMBER_OF_EARTH_PLANETS ;
    // if a variable is static final its called CONSTANT
    // some CONSTANT VARIABLE samples
    /*
    Integer.MAX_VALUE;
    Math.PI;
     */



    public FinalExample(int b){
        this.b = b;

    }
    static {
        NUMBER_OF_EARTH_PLANETS = 1;
    }


}
