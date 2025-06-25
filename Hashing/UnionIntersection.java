package Hashing;

import java.util.HashSet;

public class UnionIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,3,5,7,8,9,10};
        HashSet<Integer> set = new HashSet<>();

        //UNION
        for(int i = 0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i = 0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        System.out.println(set) ;

        //INTERSECTION
        set.clear();

        for(int i =0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        int counter = 0;
        for(int i =0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                counter++;
                set.remove(arr2[i]);
            }
        }
        System.out.println(set);

    }
}
