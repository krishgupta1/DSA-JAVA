package Array;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        List<String> list = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            if(i%3 ==0 && i%5 == 0){
                list.add("FizzBuzz");
            }
            else if(i%3 == 0){
                list.add("Fizz");
            }
            else if(i%5 == 0){
                list.add("Buzz");
            }
            else{
                String str = String.valueOf(i);
                list.add(str);
            }
        }
        System.out.println(list);
    }
}
