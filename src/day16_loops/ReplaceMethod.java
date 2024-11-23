package day16_loops;

public class ReplaceMethod {
    public static void main(String[] args) {
        String str = "java is a coding language";

        System.out.println("Before .replace(): "+str);
        str = str.replace('a','e');
        System.out.println("after .replace(): "+ str);

        str = str.replace('e','u');
        System.out.println("after .replace(): "+ str);
        System.out.println();

        String sentence = "Today is Wednesday. Wednesday is fun day because on Wednesday we have java classes";
        System.out.println(sentence);
        sentence = sentence.replace("Wednesday","Thursday"); // case sensitive
        System.out.println(sentence);
        System.out.println();


        String sentence2 = "Today is Wednesday and we have Java class. Today we will do more practice.";
        System.out.println(sentence2);
        sentence2 = sentence2.replaceFirst("Today","Tomorrow");
        System.out.println(sentence2);
        sentence2 = sentence2.replaceFirst("Wednesday","Thursday");
        System.out.println(sentence2);

        System.out.println();



    }
}
