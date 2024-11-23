package day18_loops;

import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {
//String str = "java is cool language";  // "j a v a _ i s _ c o o l _ l a n g u a g e"
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter input: ");
        String str = key.nextLine().trim().replaceAll(" ", "_"); // java -- java language


        // OPTION 1
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if (i == str.length()-1){
                break;
            }
            System.out.print(" ");
        }


        // OPTION 2
        System.out.println();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i) + " ";
        }
        System.out.println(result);
        System.out.println(result.trim());





//        System.out.println();
//        System.out.println(str);



    }
}