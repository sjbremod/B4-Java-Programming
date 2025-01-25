package day45_fuctions_stream.functional_interface;

import day28_arraylist.ConvertArrayToList;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;

public class UseFunction {
    public static void main(String[] args) {

        //Implement a code that converts array into List
        Function <int [] , List<Integer>> convertArrToList = (int [] arr ) -> {

            List <Integer> list = new ArrayList<>();
            for( int each : arr){
                list.add(each);
            }

            return list;
        };

        int [] arrNum = {233,234,1,5,645,23,1};
        System.out.println(Arrays.toString(arrNum));
        System.out.println(convertArrToList.apply(arrNum));

        // can you remove duplicates

        System.out.println(new HashSet<>(convertArrToList.apply(arrNum)));

        // can you sort it
        System.out.println(new TreeSet<>(convertArrToList.apply(arrNum)));

        //keep original list and sort
        List<Integer> list3 = convertArrToList.apply(arrNum);
        Collections.sort(list3);
        System.out.println(list3);





    }
}
