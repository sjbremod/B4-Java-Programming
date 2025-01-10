package day38_abstraction_interface.interface_methods;

public class MacbookPro implements Mac{
    @Override
    public void turnOn() {
        System.out.println("Macbook Pro is turned on");
    }
}


class Runner {
    public static void main(String[] args) {

        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);

        System.out.println(MacbookPro.NAME);
        System.out.println(MacbookPro.OS);
        System.out.println();
        //reaching abstract method with interface name - not valid
        //Mac.turnOn():
        // reaching overriden method (instance method) with class name - not valid
        // MacbookPro.turnOn();

        MacbookPro mac = new MacbookPro();
        mac.turnOn();
        System.out.println();
        // reaching static member with interface name  - VALID
        Mac.company();
        //reaching the static member with the class name - NOT VALID
        //MacbookPro.company(); // only can be called with its own interface name

       // mac.company();// only can be called with its own interface name

        System.out.println();
        //reaching the default method with interface name - NOT VALID
        //Mac.faceTime(); // non static cannot be called by interace name
        // reaching the default method with the class name - NOT VALID
        //MacbookPro.faceTime(); //non static cannot be called by interace name

        mac.faceTime();


    }
}