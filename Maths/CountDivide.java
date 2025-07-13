package Maths;

public class CountDivide {
    public static void main(String[] args) {
        int num = 121;
        int val = num;
        int count = 0;
        while(num > 0){
            int temp = num % 10;
            if(val % temp == 0) count++;
            num = num / 10;
        }
        System.out.println(count);
    }
}