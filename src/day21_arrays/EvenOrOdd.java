package day21_arrays;

public class EvenOrOdd {
    public static void main(String[] args) {

        int [] nums = {4, 1, 3, 12, 5};
        int countEven = 0;
        int countOdd = 0;
        String evenNums = "";
        String oddNums = "";
        for ( int each : nums ){

            if (each %2 ==0){
                countEven++;
                evenNums += each + " ";
            }else {
                countOdd++;
                oddNums += each + " ";
            }


        }

        System.out.println("even: "+ countEven);
        System.out.println("even numbers: " +evenNums);
        System.out.println("odd: "+ countOdd);
        System.out.println("odd numbers: "+ oddNums);










    }
}
