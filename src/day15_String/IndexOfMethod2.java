package day15_String;

public class IndexOfMethod2 {
    public static void main(String[] args) {
        String str = "java";

        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf("va"));

        System.out.println("---------------------");
        String str2 = "cbacbecbocbacb";
        System.out.println(str2. lastIndexOf("cbe"));

        System.out.println(str2.lastIndexOf("cb",200));// gives last matching even though there is no 200

    }

}
