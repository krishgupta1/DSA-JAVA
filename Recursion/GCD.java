package Recursion;

import java.util.ArrayList;

public class GCD {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       int a = 12, b =16;
       int m = Math.min(a, b);
       for(int i = m; i > 0; i-- ){
        if(a%i == 0 && b %i ==0){
            list.add(i);
        }
       }
       for(int i = 0; i<list.size(); i++){
        if(list.get(i) > list.get(i+1)){
            System.out.println(list.get(i));
            break;
        }
       }

    }
}
