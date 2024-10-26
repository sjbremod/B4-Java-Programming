package day05_variables;

public class MyName {
    public static void main(String[] args) {

        char letter1 = 'S';
        char letter2 = 't';
        char letter3 = 'e';
        char letter4 = 'v';
        char letter5 = 'e';
        char letter6 = 'n';


        System.out.println(0 +letter1);

        System.out.println("letter1 = " + letter1);
        System.out.println("letter2 = " + letter2);
        System.out.println("letter3 = " + letter3);
        System.out.println("letter4 = " + letter4);
        System.out.println("letter5 = " + letter5);
        System.out.println("letter6 = " + letter6);



        System.out.println(letter1+letter2+letter3+letter4+letter5+letter6);
        String myName = "" + letter1+letter2+letter3+letter4+letter5+letter6;
        System.out.println(myName);



    }
}
