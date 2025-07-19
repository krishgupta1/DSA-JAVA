package Maths;

public class LCM {
    public static void main(String[] args) {
        int n1 = 24;
        int n2 = 36; 
        
        int res = Integer.MIN_VALUE;
        for(int i = 1; i<=n1; i++){
            if(n1 % i == 0 && n2 % i == 0){
                res = i;
            }
        }
        // LCM formula : (a * b) / GCD(a, b)
        int ans = (n1 * n2) / res;
        System.out.println(ans);
    }
}
