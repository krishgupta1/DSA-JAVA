package Hashing;

import java.util.*;

public class AlphaHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 500);
        hm.put("Nepal", 43);
        hm.put("Bhutan", 244);
        hm.put("China", 566);
        hm.put("Africa", 542);
        System.out.println(hm);

        System.out.println(hm.get("Indonesia"));

        System.out.println(hm.containsKey("India"));

        Set <String> key = hm.keySet();
        System.out.println(key);
    }
}
