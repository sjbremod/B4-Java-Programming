package day19_nested_loops;

public class NestedLoopExample {
    public static void main(String[] args) {
        // print "Hello Loopcamp!"
        for (int i =1 ; i <= 5; i++) {
            System.out.println("Hello Loopcamp!");

        }
        System.out.println("-------------------------");
//        System.out.println("Hello Galaxy");
//        System.out.println("Hello Moon");

        /*
        Hello Galaxy
        Hello Moon
        Hello Moon

         */
        for (int i = 1; i <=3; i++) {

            System.out.println("Hello Galaxy");
            for (int j = 1; j <=2; j++) {
                System.out.println("Hello Moon");
        }
            System.out.println();

        }

// on every cycle of the outer loop the inner loop happens 2 times

        System.out.println("*******************");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <6 ; j++) {
                System.out.println(10);
            }
            System.out.println();
        }
    }
}
