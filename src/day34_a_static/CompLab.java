package day34_a_static;
//runner class
public class CompLab {

    public static void main(String[] args) {

        Computer computer1 = new Computer("Dell","Black",999.90);
        System.out.println(computer1);
        Computer
                computer2 = new Computer("Hp","Silver",599.90);

        System.out.println(Computer.hasScreen);
        System.out.println(Computer.hasBattery);
        System.out.println(Computer.hasMemory);

        computer1.price = 200.90;
        System.out.println(computer1.price);
        System.out.println(computer2.price);

        System.out.println(computer1);
        System.out.println(computer2);

        computer1.hasScreen = true; // not preferable to use object ref for static members
        // instead use class name


        System.out.println(computer1.hasScreen);
        System.out.println(computer2.hasScreen);



    }

}
