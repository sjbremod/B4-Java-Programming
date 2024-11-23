package day12_switch_statements;

public class NumberInWords2 {
    public static void main(String[] args) {
        int num = 1; //1-5 else its not in the range
//        if(num==1){
//         if(num>=1 && num <=5){
//                 System.out.println("one");
//
//            }else if (num==2){
//                System.out.println("two");
//            }else if (num ==3){
//                System.out.println("three");
//            }else if (num==4){
//                System.out.println("four");
//            }else if (num==5){
//                System.out.println("Five");
//            }else {
//                System.out.println("not in the range 1-5");
//            }

    //}
        // switch case
        switch (num){        // String, char, int, short, byte only data types that work and no other operators
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("not in range 1-5");
                // if you do not put "break;" execution goes from matching case all the way until first break or the end
                //if default is last then you dont need another break

        }
    }
}
