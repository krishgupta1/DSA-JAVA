package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        // System.out.println(fib(6));
        int n = 6;
        for(int i =0 ; i<n; i++){
            System.out.println(fib(i));
        }
    }
    static int fib(int n){
        if(n==0 || n==1){
            return n;
        }

        int prev = fib(n-1);
        int preprev = fib(n-2);
        return prev + preprev;
    }
}
