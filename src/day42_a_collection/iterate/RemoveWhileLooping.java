package day42_a_collection.iterate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLooping {
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(2,3,5,6,6,12,54,23,65,3,6));
        System.out.println(Arrays.toString(list.toArray()));
        // removeALL(object) -->

//        //1 try removing with traditional loop
//        for (int i = 0; i < list.size(); i++) {
//
//            if (list.get(i) <= 6) {
//                list.remove(i);
//            }
//        }
//        System.out.println(list);
//            // this way we have an indexing issues bc of resizing

//       // 2 try removing with foreach loop // with foreach loop  we cannot change the size while looping so this gives us an Exception
//        for (Integer eachElment : list) {
//            if (eachElment <= 6) {
//                list.remove(eachElment);
//            }
//        }
//        System.out.println(list);

        // 3 iterator
        Iterator<Integer> it  = list.iterator(); // i need this line of code to be able to call hasNext(), next(),remove();
        // it = {2,3,5,6,6,12,54,23,65,3,6}
        while(it.hasNext()){
            if (it.next()<=6){
                it.remove();
            }
        }
        System.out.println(list);
        System.out.println("-----------------");

        ArrayList<Integer>list2 = new ArrayList<>(Arrays.asList(2,3,5,6,6,12,54,23,3,6));
        System.out.println(list2);
        list2.removeIf(e->e<=6 );
        System.out.println(list2);

    }
}
