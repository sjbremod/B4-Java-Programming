package day14_String;

public class Contains {
    public static void main(String[] args) {
        String str = "Today's Java topic is more methods.";
        System.out.println( str.contains("java topic")); //false because J
        System.out.println(str.contains("Java topic")); //true because
        System.out.println(str.contains("o"));
    }
}
