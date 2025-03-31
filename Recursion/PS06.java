package Recursion;

public class PS06 {
    public static void main(String[] args) {
        int num = 154045505;
        System.out.println(zero(num, 0));
    }
    static int zero(int n, int count ){
        if(n==0){
            return count;
        }
        int rem = n % 10;
        if(rem == 0){
            count ++;
        }
        return  zero(n/10, count);
    }
}
