package Array;

public class NumberOfUnequalTriplet {
    public static void main(String[] args) {
        int[] nums = {4,4,2,4,3};
        int count=0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                for(int k = j+1; k<nums.length; k++){
                    if(nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    
}
