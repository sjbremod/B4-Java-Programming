package day18_loops;

public class RemoveDuplicates {
    public static void main(String[] args) {
        /*
        remove duplicates from a string / keep one from each
         */

        String str = "abcabbcd";
        String unique = "";


        for (int i = 0; i <str.length() ; i++) {
            char eachChar = str.charAt(i);

            // if unique does not have each char then add it
            if (!unique.contains(""+eachChar)){
                unique += eachChar;

            }
        }
        System.out.println("original: "+str);
        System.out.println("unique: " +unique);
    }
}
