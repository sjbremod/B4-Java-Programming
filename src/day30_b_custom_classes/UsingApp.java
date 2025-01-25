package day30_b_custom_classes;

// this is my runner MAIN METHOD
public class UsingApp {
    public static void main(String[] args) {

        //create an object of app class called application1
        //object reference = actual object

        App application1 = new App();
        // application1 has its own copy "name" ....

        App application2 = new App();

        application1.name = "loopcamp";
        application1.version = 4.0;
        application1.isFree = true;


        //App.run(); // since .run is instance method we cant call it by class name

        application1.run();
        application2.run();

        application2.name = "excell";
        application2.version= 23.5;
        application2.isFree = false;

        application2.run();
        System.out.println();

        application1.update();

        System.out.println(application1.version);
        application2.update();
        System.out.println(application2.version);

    }





}
