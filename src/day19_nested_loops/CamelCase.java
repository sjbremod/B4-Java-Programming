package day19_nested_loops;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("please enter multi word sentence: ");
        String str = key.nextLine().trim().toLowerCase();
        String camelCase = "" + str.charAt(0);// first letter

        for (int i = 1; i <str.length() ; i++) {
            if(str.charAt(i-1) == ' '){
                camelCase += (""+str.charAt(i)).toUpperCase();
            }else{
                camelCase += str.charAt(i);

            }



        }
        camelCase = camelCase.replace(" ","");
        System.out.println(camelCase);
        /*
        TODO: practice task
        Implement this code with while loop
        hint : while loop condition - continue as long as there is space
         */

        /*
        ```
Scanner input = new Scanner(System.in);
        System.out.print("enter a sentence: ");
        String str = input.nextLine().toLowerCase().trim();

        str = str.toLowerCase().trim();

        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.charAt(i) == ' ') {
                str = str.substring(0, i) + (str.charAt(i + 1) + "").toUpperCase() + str.substring(i + 2);
            }
        }

        String camel = str.replace(" ", "");
        System.out.println(camel);
```
alternative solution
         */
    }
}
