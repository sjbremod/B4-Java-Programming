package day12_switch_statements;

public class SwitchExample {
    public static void main(String[] args) {
        int num = 5;

        switch (num){
            case 1:
                System.out.println("before arithmetic operators applies: "+ num);
                num *=num; // num = num * num;
                break;
            case 5:
                System.out.println("before modules applies: "+ num);
                if (num%2==0){
                    System.out.println("even number");
                }else{
                    System.out.println("odd number");
                }
        }
        System.out.println("---------------");
        int num2 = 6;
        if(num2 <4){
            System.out.println("option 1");
        }else {
            switch (num){
                case 4:
                case 5:
                case 6:
                    System.out.println("num is between 4 and 6");
                    break;
                    case 7:
                        System.out.println("number is 7");
            }
        }
    }
}
