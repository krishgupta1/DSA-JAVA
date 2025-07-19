package Maths;

public class CountZeroFromLast {
    public static void main(String[] args) {
        int n = 50540000;
        boolean flag = true;
        int count = 0;
        while(flag){
            long rem = n % 10;
            if(rem == 0){
                count++;
            }
            else{
                flag = false;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}