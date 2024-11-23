package day15_String;

public class CharMethod {
    public static void main(String[] args) {
        // num of chars =   1234
        String str =       "loop";
        // indexs (location)0123
        //in string every single character has an index

       // since charAt returns a char we needed to to concatantion to make it into a string
        String firstCharInStr = ""+ str.charAt(0);
        char firstCharInStr2 = str.charAt(0); // since it returns since character we can assign it into a char datatype variable

        // what is the 1st character  ---> in str
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));


        //System.out.println(str.charAt(4)); // caused the compiler to error out

        System.out.println("hello ");


        // what is the last character ---> in str
        String str2 = "sdfdasfasdfdasfadsfasdfasdfdasfasdf fasdfasdfasdfdasfdasfasdf asdfasdfa";
        System.out.println(str2.length());
       // System.out.println(str2.charAt(70));
        System.out.println(str2.length() -1);
        System.out.println(str2.charAt( str2.length() - 2 )); // gives the last index
        System.out.println();
        System.out.println("number of characters ion str2: "+ str2.length());
        System.out.println("First character in str2: "+ str2.charAt(0));
        System.out.println("last character in str2: "+ str2.charAt(str2.length()-1));




    }
}
