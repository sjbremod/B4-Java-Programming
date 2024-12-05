package day22_arrays;

public class MinMax {
    public static void main(String[] args) {

        int [] nums = {500, 120, -80, 90, 250, -10};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for( int eachelem  : nums  ){
            if(eachelem>max){
                max= eachelem;

            }
            if(eachelem<min){
                min= eachelem;
            }

        }

        System.out.println("max: "+max);
        System.out.println("min: "+min);;



    }
}
