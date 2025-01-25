package day42_b_maps.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {

        HashMap <Integer, String > map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(0, "zero");
        map.put(-1, "minusOne");
        map.put(20,"two"); //duplicate values are allowed
        map.put(null,null); // is allowed


        map.put(Integer.parseInt("10"),"ten");
        System.out.println(map);

        map.put(1,"THIS IS ONE");





        //hashmap - has no guaranteed insertion order
        //hashmap - no index's
        System.out.println(map.get(2)); // gets the value of 2 "two"
        System.out.println(map.get(5)); // will return null because there is no 5 key
        String str = map.get(3); // 3 is not the index  it's the key value --- returns the value which is "three"
        System.out.println(str);
        System.out.println("-----------------------------------------------------------------------------");

        //how to remove
        map.remove(1);
        System.out.println(map);
        System.out.println(map.remove(11));// will return null bc its on in the map
        System.out.println(map.remove(0));
        System.out.println(map);
        System.out.println("-----------------------------------------------------------------------------");
        // how to check if the specific key exist among all the keys
        map.containsKey(11);// returns false
        map.containsKey(-1);// returns true

        System.out.println(map.containsValue("one"));//false
        System.out.println(map.containsValue("minusOne"));
        System.out.println(map.get(-1).contains("One"));
        System.out.println(map);
        System.out.println("-----------------------------------------------------------------------------");
        map.put(null,"NewValue");
        System.out.println(map);
        map.put(30,null);
        map.put(40,null);
        System.out.println(map);
        System.out.println("-----------------------------------------------------------------------------");


        Map<String, String> cartoonCharacters = new HashMap<>();
        cartoonCharacters.put("Tom","Jerry");
        cartoonCharacters.put("Winnie","Pooh");

        Map<String, String> movieStars = new HashMap<>();
        movieStars.put("James","Bong");
        movieStars.put("Sherlock","Holmes");

        Map <String,Map<String,String>> infoForEachGroup = new HashMap<>();
        infoForEachGroup.put("cartooncharacters",cartoonCharacters);
        infoForEachGroup.put("moviestars",movieStars);

        System.out.println(cartoonCharacters);
        System.out.println(movieStars);
        System.out.println(infoForEachGroup);

        Map <String, String> infoForCharacterGroup = infoForEachGroup.get("cartooncharacters");
        System.out.println(infoForCharacterGroup);

        // Can you get me the last name that is associated with James from infoForEachGroup map
        infoForEachGroup.get("MoviesStars"); // {Sherlock=Holmes, James=Bond}
        System.out.println( infoForEachGroup.get("MoviesStars").get("James") ); //Bond


    }
}
