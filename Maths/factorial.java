package Maths;

public class factorial {
    public static void main(String[] args) {
        int n = 5;
        int res = 1;
        for(int i = 2; i<=n; i++){
            res *= i;
        }
        System.out.println(res);
    }
}
