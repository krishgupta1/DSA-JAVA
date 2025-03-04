package Array;

public class MostFrequentElement {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,3};
        int key = 2;
        int frequent = 0;
        for(int i = 0; i<nums.length-1; i++){
            // for(int j = 1; j<nums.length; j++){
                if(nums[i] == nums[i+1]){
                    frequent = nums[i];
                }
            // }
        }
        System.out.println(frequent);

    }
}
