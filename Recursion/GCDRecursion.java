package Recursion;

public class GCDRecursion {
    public static void main(String[] args) {
        
        System.out.println(iGCD(12,16));
        System.out.println(gcd(12, 16));
        System.out.println(lcm(10, 12));
    }

    static int iGCD(int x, int y){
        while (x%y !=0) {
            int rem = x  % y;
            x = y;
            y = rem;
        }
        return y;
    }

    static int gcd(int x, int y){
        if(y==0){
            return x;
        }
        return gcd(y, x % y);
    }
    static int lcm(int x, int y){
        if(y==0){
            return x;
        }
        return (x*y)/gcd(x, y);
    }
}