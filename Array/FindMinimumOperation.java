package Array;

public class FindMinimumOperation {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int op = 0;
        for(int i = 0; i <nums.length; i++){
            if(nums[i] % 3 != 0){
                op++;
            }
        }
        System.out.println(op);
    }
}
