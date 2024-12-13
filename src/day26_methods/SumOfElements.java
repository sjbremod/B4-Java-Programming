package day26_methods;

public class SumOfElements {
    public static void main(String[] args) {

        int [] arr = {1, 3,5,23,65,76};
        System.out.println(sum(arr));

        // with var args  you can use values directly in method calling as an array
        System.out.println(sum(1,3,5,23,65,76));

    }
    public static int sum(int ... arr){
        int total = 0;
        for (int each  :arr  ){
            total += each;
        }


        return total;
    }
//        public static int sum(int [] arr){
//            int total = 0;
//            for (int each  :arr  ){
//                total += each;
//            }
//
//
//        return total;
//        }




}
