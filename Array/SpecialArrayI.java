package Array;

public class SpecialArrayI {
    public static void main(String[] args) {
        int[] nums = {2,1,4};
        boolean res = true;
        for(int i = 1; i<nums.length-1; i++){
            if(nums[i] % 2 == 0 && nums[i-1] % 2 != 0 || nums[i] % 2 != 0 && nums[i-1] % 2 == 0 ){
                res = true;
            }
            else{
                res = false;
            }
        }
        System.out.println(res);
        
    }
}