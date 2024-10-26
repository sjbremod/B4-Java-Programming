package day06_b_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {

        int y = 5;
        System.out.println(y);
        y = -y; // reassigned to new value ---- new value is NEGATIVE value
        System.out.println(y);
        int x =0;
        System.out.println(x);
        x = x + 1; // re assigning new valve +1 to it self
        System.out.println(x);

        System.out.println("========");

        //pre-increment // increase by 1
        ++x; // x= x+1
        System.out.println(x);

        // post increment - increase it by 1
        x++;
        System.out.println(x); //3


        //sometimes you need to update the variable inside the action/statement

        System.out.println(++x);//
// in the printstatement about , i got 2 actions
        //order pre increment ---- then print
        // 1) printstatement
        // 2) re assignment

        System.out.println(x);//
        System.out.println("========");
        System.out.println(x++); // in the printstatement about , i got 2 actions
        // print ---- then post increment
        System.out.println(x);

        --x;
        System.out.println(x);
        x--;
        System.out.println(x);
        System.out.println("========");
        System.out.println(--x);
        System.out.println(x);
        System.out.println(x--);
        System.out.println(x);




    }
}
