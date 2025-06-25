package Array;

public class FindTheDigitGameWon {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,10};
        int count1 = 0, count2 = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]<10){
                count1+= nums[i];
            }
            else{
                count2 += nums[i];
            }
        }
        if(count1>count2){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
