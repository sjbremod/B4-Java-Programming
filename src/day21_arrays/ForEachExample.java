package day21_arrays;

public class ForEachExample {
    public static void main(String[] args) {


    int [] nums = {3, 4, 5};
        //fori
        for (int i = 0; i <nums.length ; i++) {
            System.out.println("traditionial loop: "+nums[i]);

        }
        System.out.println();
        //option 2 with foreach loop

        for (  int eachElem : nums  ){
            System.out.println("foreach loop : " +eachElem);

        }
        // you can only start from the beginning and go all the way to the end
        // you can only get/read - cannot re-assign

        System.out.println();
        String [] names = new String[4];
        for ( String each: names){
            System.out.println(each);


        }
        System.out.println();
        double [] arr3 = {34, 28, 56, 87};
        for (double each : arr3){
            System.out.println(each);
        }
        System.out.println();
        char [] letters = {'l', 'o', 'o','p','c','a','m','p'};
        for (int i = letters.length/2; i <letters.length ; i++) {
            System.out.println(letters[i]);



        }

    }
}

