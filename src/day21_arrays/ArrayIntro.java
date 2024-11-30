package day21_arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        String str1 = "Denver";

        char letter1 = str1.charAt(0);
        char letter2 = str1.charAt(1);
        char letter3 = str1.charAt(2);
        char letter4 = str1.charAt(3);
        char letter5 = str1.charAt(4);
        char letter6 = str1.charAt(5);



        String str2 = "Chicago Fairfax NewYork Boston";
        String city1 = "Chicago";
        String city2 = "Fairfax";
        String city3 = "NewYork";
        String city4 = "Boston";

        // option 1 - declare and assign values directly | 4 elements are added ---> size is 4
        // String [] cities 11 = { city1, city2, city3, city4}

        String[]cities1 = {"Chicago", "Fairfax", "NewYork", "Boston"};

        //option 2 - declare array with size only. this shows that it has 4 locations
        String [] cities2 = new String [4];

        // how do we access those elements
        // each element has an index
        System.out.println(cities1[0]);
        System.out.println(cities1[1]);
        System.out.println(cities1[2]);
        System.out.println(cities1[3]);
        System.out.println();
        System.out.println(cities2[0]); // when we create an array just with the size but no value added, it shows that location is there but empty  ---> returns null
        System.out.println();
        System.out.println(cities1); // [Ljava.lang.String;@6acbcfc0 --> cant print arrays directly. it will show some memory location/hascode

        System.out.println(Arrays.toString(cities1)); // Arrays class is used, and it comes from java.util package --> we used .toString method

        System.out.println();
        // how can i remove square bracket
        String arrayToString =  Arrays.toString(  cities1 ); // "[Chicago, Fairfax, NewYork, Boston]"
        System.out.println(arrayToString);

        arrayToString = arrayToString.substring(1, arrayToString.length()-1);
        System.out.println(arrayToString);

        arrayToString = arrayToString.replace(",", "");
        System.out.println(arrayToString);


        System.out.println();
        // How do I get how many elements I have --- > size
        String [] cities3 = {"Chicago", "Fairfax", "NewYork", "Boston", "Chantilly", "Falls Church"};
        System.out.println(   cities3.length   );

    }
}
