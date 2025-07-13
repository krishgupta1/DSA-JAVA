package Maths;

public class Power {
    public static void main(String[] args) {
        int base = 2;
        int power = 4;
        int res = 1;
        for(int i = 0; i<power; i++){
            res = base * base;
        }
        System.out.println(res);
    }
}
         