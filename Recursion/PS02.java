package Recursion;

public class PS02 {
    public static void main(String[] args) {
        num(10);
        num2(10);
        fact(5);
        System.out.println(fact(5));
    }
    // Non Tail
    static void num(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        num(n-1);
    }

    //Tail confirm it,...
    static void num2(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        num2(n-1);
        System.out.println(n);
    }
    static int fact(int n ){
        if(n<=1){  
            return 1;
        }
        
        return n* fact(n-1);
    }
}