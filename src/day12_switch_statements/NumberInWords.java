package day12_switch_statements;

public class NumberInWords {
    public static void main(String[] args) {
        int num = 5; //1-5 else its not in the range
        if(num>=1 && num <=5){
            if(num==1){
                System.out.println("one");

            }else if (num==2){
                System.out.println("two");
            }else if (num ==3){
                System.out.println("three");
            }else if (num==4){
                System.out.println("four");
            }else{
                System.out.println("Five");
            }

        }else{
            System.out.println("its not in the range");
        }
    }
}
