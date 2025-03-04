package Array;

public class LargestPositiveAndNegativeInteger {
    public static void main(String[] args) {
        int[] nums = {-1,2,-3,3};
        int maxPos = 0;
        int maxNeg = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j =i+1; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    maxPos = nums[i];
                }
            }

        }
        System.out.println(maxPos);
    }
}
