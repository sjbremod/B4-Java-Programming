package day28_arraylist;

import java.util.Arrays;

public class HtmlGenerator {
    public static void main(String[] args) {

        String str = "div^7";

        System.out.println(htmlGenerator(str));

    }
        public static String htmlGenerator (String str){
            String result = "";

            String [] arr = str.replace("^"," ").split(" ");
            int numOfCycle  = Integer.parseInt(arr [1]);
            for (int  i = 0; i <numOfCycle ; i++) {
              result +=  "<"+arr[0]+ "></"+ arr[0]+ ">";
            }





       return result;

    }

}
