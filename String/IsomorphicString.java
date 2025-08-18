package String;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "egg", t = "add";
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map1.containsKey(i)){
                map1.put(i, map1.getOrDefault(map1.get(i) , 0) + 1);
            }
            else{
                map1.put(i, 1);
            }
        }
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map2.containsKey(i)){
                map2.put(i, map2.getOrDefault(map2.get(i) , 0) + 1);
            }
            else{
                map2.put(i, 1);
            }
        }
        System.out.println(map1.equals(map2));
    }
}
