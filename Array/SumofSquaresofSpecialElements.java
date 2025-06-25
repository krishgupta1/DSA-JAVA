package Array;

public class SumofSquaresofSpecialElements  {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int total = 0;

        for(int i = 0; i<nums.length; i++){
            int a = i + 1;
            if(nums.length%a == 0){
                int x = nums[i] * nums[i];
                total = total + x;
            }
        }
        System.out.println(total);
    }    
}
