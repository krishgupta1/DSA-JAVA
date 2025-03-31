package Recursion;

public class PS07 {
    public static void main(String[] args) {
    int num = 14;
    int count = 0;
    while(num != 0){
        if(num % 2 == 0){
            num = num / 2;
            count++;
        }
        else if(num % 2 != 0){
            num = num - 1;
            count++;
        }
    }


    System.out.println(count);

    }

    public int numberOfSteps(int num){
        return helper(num, 0);
    }
    private int helper (int num, int steps){
        if(num == 0){
            return steps;
        }
        if(num % 2 == 0){
            return helper(num/2, steps+1);
        }
        else{
            return helper(num-1, steps+1);
        }
    }
}
