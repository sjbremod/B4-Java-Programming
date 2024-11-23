package day18_loops;

public class BranchingExample {
    public static void main(String[] args) {
        // breal;
        //continue;

        System.out.println("traditional For loop/fori loop without break or continue: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");

        }

        System.out.println();
        System.out.println("traditional For loop/fori loop with break and without continue: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            break;
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }
        }


            // System.out.println("hi"); // this line will never get reached because of the continue statement
        System.out.println();
        System.out.println("traditional For loop/fori loop with break with  continue: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if(i ==5){
                continue;
            }
            System.out.println("hi");
        }
        System.out.println();
        for (int i = 1; i < 10; i++) {
            if(i % 2==1){
                continue;
            }
            // print only even numbers
            System.out.print(i + " ");
        }




    }
}
