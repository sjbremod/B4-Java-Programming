package day33_a_static;

public class BestBuy {

    //instance variable - belongs to each object
    String location;

    // static variable - belongs to all object, one copy (value) for all
    static String headquarter = "7601 Penn Ave south, Richfield,Minnesota";

    static String specialDay = "28th Dec";





    // constructor - helps to initizlize the instance variables
    public BestBuy (String location){
        this.location=location;

    }
    //instance method
    public void openStore(){
        System.out.println("opening the store in location: "+ location);

        //in instance method we can reach both instance and static members
        System.out.println("Headquarters is "+headquarter);
    }


    //static methods
    public static void specialsDaySale(){
        System.out.println("there is %40-$70 discount on "+specialDay);
        // static only accepts statics
    }

}
/**
 * static
 *      -all objects share / have the one/same copy
 *      - if its updated, all objects are affected
 *      - we use class name to reach the static members
 *          - possible to use the object ref as well but not good approach
 *      - Static only accepts static members
 *      - we cannot use 'this' keyword
 *
 *
 *
 *
 *      instance
 *          - every object has its own copy
 *          - if instance for one object is changed/updated, it only affects that object
 *          - we use object ref to each instance members
 *              - NOT possible to use the Class name to reach the instance members
 *             - Instance accepts BOTH static and instance members
 *
 */
