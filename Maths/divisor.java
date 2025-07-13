package Maths;
import java.util.ArrayList;

public class divisor {
    public static void main(String[] args) {
        int num = 24;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if(num % i == 0){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}