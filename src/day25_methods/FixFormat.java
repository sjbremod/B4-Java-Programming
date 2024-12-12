package day25_methods;

public class FixFormat {
    public static void main(String[] args) {

    fixFormat("MICKY");
        System.out.println(fixFormat("MOUse"));

        String name = "TOM";
        fixFormat(name);
        System.out.println(fixFormat(name));
    }

    public static String fixFormat(String input){


        String result = "";
        result = input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();

        return result;
    }

}
