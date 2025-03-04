package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // Size of set
        System.out.println("Size : " + set.size());
        System.out.println();

        // Print all set
        System.out.print(set);

        //Search

        if(set.contains(1)){
            System.out.println("Set Contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Set Does Not Contain 6");
        }

        // Delete
        set.remove(2);

        if(!set.contains(2)){
            System.out.println("Doesn't Contain 2 as we delete 2");
        }

        // Iterator
        System.out.println();
        System.out.println("Iterating in Set");
        Iterator it = set.iterator();
        while ((it.hasNext())){
            System.out.println(it.next());
        }
    }
}
