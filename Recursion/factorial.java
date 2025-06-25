package Recursion;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(4));
    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        int smallans = fact(n-1);
        int ans = n*smallans;
        return  ans;
    }
}