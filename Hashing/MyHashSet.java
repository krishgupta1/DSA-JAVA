package Hashing;
import java.util.*;
public class MyHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(40);
        System.out.println(set);
        set.remove(2);
        if(set.contains(2)){
            System.out.println("Contains 2");
        }
        
        else{
            System.out.println("not contains 2 ");
        }

        // set.removeAll(set);

        if(set.isEmpty()){
            System.out.println("Set is Empty");
        }

        Iterator it = set.iterator();
        while (it.hasNext()) { 
            System.out.println(it.next());
        }

        // Other Methods

        for(int num : set){
            System.out.println(num);
        }
        

        // Linked Hashset
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(40);
        System.out.println(lhs);

        // TreeSet
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(20);
        ts.add(40);
        ts.add(50);
        System.out.println(ts);
    }
   
       
}
