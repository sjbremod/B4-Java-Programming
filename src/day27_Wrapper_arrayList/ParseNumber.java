package day27_Wrapper_arrayList;

public class ParseNumber {
    public static void main(String[] args) {

        /*                                     value        convert to be Wrapper                               convert to be primitive
         "1" is a String data type              number      Byte.valueOf("1")----> Byte b = 1;                Byte.parseByte("1")---- byte b = 1
         "true" is also a String data type      boolean     Boolean.valueOf("true" --> boolean b1 = true;     Boolean.parseBoolean("true")-- boolean b1= true;



         */

       // if ("true"){
          //  System.out.println("Pass");
//        }

        if (Boolean.valueOf("true")){
            System.out.println("Pass");
        }
        if( Boolean.parseBoolean("true")){ // converting String into primitive data type
            System.out.println("pass");
        }
        System.out.println("-----------------------");

        String year = "2024";
        System.out.println("current year is: " + year);
        System.out.println("next year will be: " +(year+1));// String + 1 --- concatenation

        int yearInNum1 = Integer.parseInt(year);




        Integer yearInNum2 = Integer.valueOf(year);
        System.out.println("next year will be: " +(yearInNum1+1));
        System.out.println("next year will be: " +(Integer.parseInt(year)+1));


    }

}
