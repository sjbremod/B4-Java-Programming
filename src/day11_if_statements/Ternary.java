package day11_if_statements;

public class Ternary {
    public static void main(String[] args) {

        int a = 71;
        String result;
        // option 1 with regular if else statement
        if(a % 2 == 0){
           // System.out.println("even number");
            result = "Even Number ";
        }else{
            //System.out.println("odd number");
            result = "odd number";
        }
        System.out.println(result);

        //option 2 with ternary
        // condition ? value1 : value2
        //     - value1 ---> if condition is true
        //     - value2 ---> if condition is false
       result =  (a % 2 == 0) ? "even number from ternary" : "odd number from ternary"; //() isnt needed but good to use
        // if you are assigning the result of ternary into a variable, the data type has to match
        System.out.println(result);


        // this works becasue its not assigning it to a variable  just a print statement
        System.out.println((a % 2 == 0) ? "even number from ternary" : 34 );
        System.out.println((a % 2 == 0) ? "even number from ternary" : true );
        System.out.println("__________________" );
         int num;
         // cant do this bc they are not the same data type
        // num = (4>2 && 4<20 )? 45 : "65";
        num = (4>2 && 4<20 )? 45 : 65;
        System.out.println(num);
        System.out.println("__________________" );
        int n =  50 ;
        System.out.println(50>0 ? " positive" : "negative");
        String str = 50 <0 ? "+" : "-";
        System.out.println(str);




    }
}
