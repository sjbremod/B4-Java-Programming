package day14_String;

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "          loop   camp           ";
        System.out.println(str);
        System.out.println(str.length());

        str = str.trim();
        System.out.println(str);
        System.out.println(str.length());

        String str2 = "      java is fun         ";
        System.out.println(str2.length());
        System.out.println();
        String str3 = "\tThursday";
        System.out.println(str3.length());
        System.out.println(str3.trim().length());
        System.out.println(str3);
        System.out.println(str3.trim());

    }
}
