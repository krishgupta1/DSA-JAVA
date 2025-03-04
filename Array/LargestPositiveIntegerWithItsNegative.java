package Array;

public class LargestPositiveIntegerWithItsNegative {
    public static void main(String[] args) {
        int[] nums = {-1,10,6,7,-7,1};
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length-1; i++){
            max = nums[i];
            for(int j = 0; j<nums.length; j++){
                if (nums[j] == -nums[i] || nums[i] == -nums[j]) {
                    if (max > nums[j]) {
                        max = nums[i];
                    }
                }
            }
            
        }

        System.out.println(max);
    }
}
