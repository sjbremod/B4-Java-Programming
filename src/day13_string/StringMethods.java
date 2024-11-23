package day13_string;

public class StringMethods {
    public static void main(String[] args) {

        String name1 = "Micky";
        String name2 = "Micky";
        String name3 = new String("Micky");


        // == this will compare memory location
        System.out.println(name1 == name2);//t same memory location
        System.out.println(name1 == name3);//f
        System.out.println(name2== name3);//f

        System.out.println("=====================");
        // use the .equals() method this will compare string value including case sensitiveness

        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name1.equals(name3));
        System.out.println("Micky".equals(name1));
        System.out.println(name1.equals("Micky"));
        System.out.println(new String("Micky").equals(name1));
        System.out.println(name1.equals(new String("Micky")));
        System.out.println("Micky".equals(new String("Micky")));
        System.out.println(new String("Micky").equals("Micky"));

        String str1 = new String("Micky");
        String str2 = new String("Micky");
        System.out.println(str1.equals(str2));
        String str3 = "Micky";
        String str4 = "MICKY";
        // then how do we ignore the case sensitiveness
        //.equalsIgnoreCase()  this will compare the string value ignore the case sensitiveness

        System.out.println(str3.equalsIgnoreCase(str4));

        String word1 = "Monday";
        String word2 = new String("Monday");
        String word3 = "Mon";
        System.out.println("comparing values: " + word1.equalsIgnoreCase(word2));
        System.out.println(word1.equalsIgnoreCase(word3));

        char letter1 = 'A';
        String letter2 = "B";

        System.out.println((letter1+"").equals(letter2));
        System.out.println("----------------------");
        String school = "loopcamp";
        System.out.println(school);
        System.out.println(school.length());
        int numOfChars = school.length();
        System.out.println("number of characters: "+ numOfChars);

        System.out.println(str2.length());








    }
}
