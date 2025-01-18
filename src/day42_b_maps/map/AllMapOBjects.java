package day42_b_maps.map;

import java.util.*;

public class AllMapOBjects {
    public static void main(String[] args) {

        //<TeacherName, ClassName>
        Map<String,String> map1 = new HashMap<>();
        map1.put("feyruz", "java");
        map1.put("nadir", "selenium");
        map1.put("Diana", "MentorGroup2");
        map1.put("Iryna", "MentorGroup1");
        map1.put(null, "generalText");
        map1.put("test", null);
        map1.put("check", null);

        System.out.println("\n"+map1);

        //HashMap : random order - null as kye is allowed
        System.out.println("-----------------------------------------");
        Map<String,String> map2 = new LinkedHashMap<>();
        map2.put("feyruz", "java");
        map2.put("nadir", "selenium");
        map2.put("Diana", "MentorGroup2");
        map2.put("Iryna", "MentorGroup1");
        map2.put(null, "generalText");
        map2.put("test", null);
        map2.put("check", null);

        System.out.println(map2);
        //LinkedHashMap : Insertion order - null as Key is allowed
        System.out.println("-----------------------------------------");

        Map<String,String> map3 = new TreeMap<>();
        map3.put("feyruz", "java");
        map3.put("nadir", "selenium");
        map3.put("Diana", "MentorGroup2");
        map3.put("Iryna", "MentorGroup1");
//        map3.put(null, "generalText");// null is not ok as key
        map3.put("test", null); // null as value is allowed
        map3.put("check", null); // null as value is allowed
        System.out.println(map3);

        System.out.println("-----------------------------------------");

        Map <String,String> map4 = new Hashtable<>();
       map4.put("feyruz", "java");
       map4.put("nadir", "selenium");
       map4.put("Diana", "MentorGroup2");
       map4.put("Iryna", "MentorGroup1");
       //map4.put(null, "generalText");// null is not ok as key
      // map4.put("test", null); // null as value is not allowed
      // map4.put("check", null); // null as value is not allowed
        System.out.println(map3);
// HashTable is thread safe ie synchronized


    }
}
