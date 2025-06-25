package Array;

public class MaximumProductofTwoElementsinanArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,5};
        int product = 0;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if((nums[i]-1)*(nums[j]-1) > product){
                    product = (nums[i]-1)*(nums[j]-1);
                }
            }
        }

        // product = (nums[max1]-1)*(nums[max2]-1);
        System.out.println(product);
    }
}
