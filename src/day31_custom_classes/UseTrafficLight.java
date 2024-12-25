package day31_custom_classes;

public class UseTrafficLight {
    public static void main(String[] args) {

        //object reference = actual object
        //                 = constructor
//        TrafficLight obj1 = new TrafficLight();
//        System.out.println(obj1.color);

        //initialized the instance variable color to be yellow
       /* obj1.color = "yellow";
        System.out.println(obj1.color);*/

        //we initialized the instance variable called color to be set to yellow
        TrafficLight obj2 = new TrafficLight("yellow");
        System.out.println(obj2.color);

        TrafficLight obj3 = new TrafficLight("red");
        System.out.println(obj3.color);



    }
}
