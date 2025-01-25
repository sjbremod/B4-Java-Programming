package day27_Wrapper_arrayList;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList <String> arrList = new ArrayList<>(); //capacity is 10
        System.out.println(arrList.size()); // but size is 0
        //arrList.add(10) // not valid because its looking for a string

        arrList.add("java");
        arrList.add("bread");
        arrList.add("water");
        arrList.add("butter");
        System.out.println(arrList);
        arrList.add(0,"banana");
        System.out.println(arrList);

        System.out.println();
        arrList.remove(0);
        System.out.println(arrList);
       String removedElem =  arrList.remove(1);
        System.out.println(removedElem);
        System.out.println(arrList);
        arrList.remove(arrList.size()-1);

        System.out.println(arrList);

        arrList.add("api");
        arrList.add("sql");
        arrList.add("soft-skills");
        arrList.add("agile");
        arrList.add("soft-skills");
        System.out.println(arrList);

        arrList.remove("soft skills");
        System.out.println(arrList);
       boolean isRemoved2 =  arrList.remove("soft-skills");
        System.out.println(arrList);
        System.out.println(isRemoved2);









    }
}
