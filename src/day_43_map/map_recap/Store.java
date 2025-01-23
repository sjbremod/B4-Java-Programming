package day_43_map.map_recap;

import java.util.*;

public class Store {
    public static void main(String[] args) {

        Map<String,Double> store = new HashMap<>();
        // 1.1 .put
        store.put("Water", 2.9);
        store.put("Bread", 1.8);
        store.put("Cheese", 1.4);
        store.put("Coffee", 1.4);
        store.put("Potato", 1.2);
        System.out.println(store);

        //.put for update or new...

        store.put("Bread",2.1);
        System.out.println(store);

        //2 .get(key)
        System.out.println(store.get("Water"));
        System.out.println(store.get("Apple"));// returns null because there is no key

        //3 .remove(key)
        store.remove("Water");
        System.out.println(store);

        //4 .containsKey(key)
        System.out.println(store.containsKey("Water"));
        System.out.println(store.containsKey("Coffee"));

        //5 containsValue(value)
        System.out.println(store.containsValue("Potato"));
        System.out.println(store.containsValue(2.1));
        System.out.println(store.containsValue(1.4));

        //6 .size() returns the number of entrys
        System.out.println(store.size());

        System.out.println("-------------------------");
        //7 .keySet() it will return a set of keys
        System.out.println(store.keySet());
        Set<String> keyInStore = store.keySet();
        System.out.println(keyInStore);

        // 8 .value() returns all the values
        System.out.println(store.values());
        Collection<Double> valuesInStore = store.values(); // returns Collection interface
        System.out.println(valuesInStore);

        System.out.println("-------------------------");

        //7.a loop through the Keys and get each key
        for( String eachKey : store.keySet() ){
            System.out.print(eachKey);
            System.out.println("-"+store.get(eachKey));

        }
        System.out.println("**************");
        //8.a loop through value's and get each value

        //store.values();
        for( Double eachValue:  store.values()){
            System.out.println(eachValue);
        }
        System.out.println("========================");
        //9 looping through Map (key,value) or entry's

       // System.out.println(store.entrySet()); // [Potato=1.2, Cheese=1.4, Coffee=1.4, Bread=2.1]

        for (Map.Entry<String,Double> eachPair: store.entrySet()){
            System.out.println(eachPair); // each Key-Value pair is now assigned to a single Map
            System.out.println(eachPair.getKey());
            System.out.println(eachPair.getValue());
            System.out.println("item: " +eachPair.getKey()+ "\tvalue: " +eachPair.getValue());



        }

    }
}
