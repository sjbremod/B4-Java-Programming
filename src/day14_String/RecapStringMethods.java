package day14_String;

public class RecapStringMethods {
    public static void main(String[] args) {
        String str1 = "loop";               // created by by literals "" stored in the string pool inside of heap
        String str2 = new String("loop"); // created by new keyword stored directly to the heap

        System.out.println(str1 == str2); // comparing memory location

        System.out.println("comparing with .equals() method " +str1.equals(str2));// comparing actual values


        System.out.println("comparing with .equals() method " +str1.equals("loop"));
        System.out.println("comparing with .equals() method " +"loop".equals("loop"));
        System.out.println("comparing with .equals() method " +new String("loop").equals("str2"));
        System.out.println("comparing with .equalsIgnoreCase() method " +str1.equalsIgnoreCase("loop"));
        System.out.println("comparing with .equalsIgnoreCase() method " +str1.equalsIgnoreCase("LOOP"));
        System.out.println("comparing with .equalsIgnoreCase() method " +str1.equalsIgnoreCase("LOoP"));

        boolean isSameWithNoUpperCase = "lOop".equalsIgnoreCase(new String("lOOp"));
        System.out.println(isSameWithNoUpperCase);

        if(isSameWithNoUpperCase){
            System.out.println(" those two string values are same with ignoring case sensitiveness");
        }else{
            System.out.println(" those two strings values are not same with ignoring case sensitiveness");
        }
        System.out.println("----------------------");
        System.out.println(str1.length());
        System.out.println(str2.length());

        int numOfCharactersInString = str1.length();
        System.out.println("Numbers of characters in str1 " + numOfCharactersInString);
        int num = 9;
        //System.out.println(num.legth()); // you cannot apply string method on int datatype
        System.out.println(num +"".length() ); //9   9 + "" ----> "9"
        System.out.println(num); // this is still in the original datatype


        if(str1.length() %2 ==0 ){ //str1 = "loop";
            System.out.println("the word has even numbers of characters");
        }else{
            System.out.println("the word has odd number of characters");
        }


    }
}
