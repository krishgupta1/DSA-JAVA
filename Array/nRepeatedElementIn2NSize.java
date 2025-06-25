package Array;

public class nRepeatedElementIn2NSize {
    public static void main(String[] args) {
        int[] nums = {5,1,5,2,5,3,5,4};
        int n = nums.length/2;
        int count = 0;
        int result = 0;
        for(int i = 0; i<nums.length; i++){
            count = 0;
            for(int j = 0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == n){
                result = nums[i];
            }
        }

        System.out.println(result);
        
    }

}
