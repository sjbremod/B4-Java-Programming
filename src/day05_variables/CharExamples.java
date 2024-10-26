package day05_variables;

public class CharExamples {
    public static void main(String[] args) {
        char letter1 = 'a';
        char letter2 = 'Z';
        char letter3 = '9';
        char letter4 = '%';

        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(letter4);

        System.out.println(letter1 + letter2); //'a' +'Z' --- ascii table 97+90 = 187
        // treats them as a number at this point  because every letter has a number assigned to it in the ascii table


        System.out.println("" + letter1 + letter2); //---aZ because of the "" its a String

// another way to declare char with numbers from ascii / unicode table

        char letter5 = 84;
        System.out.println(letter5); // 84 = T in ascii table
        char letter6 = 2345;
        System.out.println(letter6); // prints out weird symbol from ascii table
// every char has a number assigned to it
        System.out.println();
        System.out.println(letter1+letter2+letter3+letter4); // 281 int
        System.out.println("chars: "+ letter1+letter2+letter3+letter4); // aZ9% concatanation




    }



}
