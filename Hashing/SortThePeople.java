package Hashing;

import java.util.TreeMap;

public class SortThePeople {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int []heights = {180,165,170};
        TreeMap<String, Integer> map = new TreeMap<>();
        for(int i = 0; i<names.length; i++){
            map.put(names[i], heights[i]);
        }
    }
}
