package Array;

public class MinumumSumOfMountainTriplet {
    public static void main(String[] args) {
        int[] nums = {8,6,1,5,3};
        int res = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                for(int k = j+1; k<nums.length;k++){
                    if(nums[i]<nums[j] && nums[k] <nums[j]){
                        int val = (nums[i] + nums[j] + nums[k]);
                        if(res > val){
                            res = val;
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }
}
