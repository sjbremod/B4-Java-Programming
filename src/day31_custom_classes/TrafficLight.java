package day31_custom_classes;

public class TrafficLight {
    // rule 1
    // if in the class, we do not have any EXPLICITLY declared constructor, there is a default constructor there
    //default constructor doesn't have any parameters and is not declared
    // it is hidden
    // public className () {}


    //rule 2
    //once you declare a constructor explicitly, the compiler does not create a default constructor
//    public TrafficLight () {
//
//    }

    String color;
// declared a constructor
public TrafficLight (String color1){
color = color1;
}



}
