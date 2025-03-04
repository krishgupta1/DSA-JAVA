package Hashing;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();

        // Inserting

        map.put("India", 1000);
        map.put("USA", 2000);
        map.put("China", 3000);

        System.out.println(map);

        //Value Update -- iF key exist update the value and if not then create new
        map.put("China", 180);
        System.out.println(map);


        // Searching
        if(map.containsKey("China")){
            System.out.println("Key Present In MAP");
        }
        else{
            System.out.println("Is not Present in Map");
        }

        // Printing the value of the Key--- if key exist it print else it prints NULL
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        for(Map.Entry <String, Integer> e: map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

    }
}
