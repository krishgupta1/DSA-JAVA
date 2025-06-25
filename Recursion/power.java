package Recursion;
public class power {
    public static void main(String[] args) {
        System.out.println(pow2(5, 5));
    }
    static int pow(int p, int q){
        if(q==0){
            return 1;
        }
        return pow(p, q-1) * p;
    }

    static int pow2(int p, int q){
        if(q==0){
            return 1;
        }
        int small = pow(p, q/2);
        if(q%2 == 0){
            return small * small;
        }
        return p * small *small;
    }
}