package String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class KthDistinctArray {
    public static void main(String[] args) {
       String[] arrStrings = { "d", "b", "c", "b", "c", "a" };
       int k = 2;
       System.out.println(kthDistinct(arrStrings,k));
   }


   public static String kthDistinct(String[] arr, int k) {
       HashMap<String, Integer> hashMap = new HashMap<>();
       for (int i = 0; i < arr.length; i++) {
           if (hashMap.containsKey(arr[i])) {
               hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
           } else {
               hashMap.put(arr[i], 1);
           }
       }
       ArrayList<String> arrayList = new ArrayList<>();
       Set<String> set= hashMap.keySet();
       for (String string : set) {
           if (hashMap.get(string)==1) {
               arrayList.add(string);
           }
       }
       String res = "";
       for (int i = 0; i < arrayList.size(); i++) {
           if (i==k-2) {
               res=arrayList.get(i);
               return res;
           }
       }
       return res;
   }
}