package Hashing;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class AlphaLinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 567);
        lhm.put("China", 123);
        lhm.put("Bhutan", 321);
        lhm.put("USA", 755);
        System.out.println(lhm);

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 567);
        tm.put("China", 123);
        tm.put("Bhutan", 321);
        tm.put("USA", 755);
        System.out.println(tm);
    }
}
