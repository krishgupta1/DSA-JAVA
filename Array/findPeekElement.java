package Array;

public class findPeekElement {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int index = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j <nums.length; j++){
                if(nums[j] > nums[i]){
//                    System.out.println(nums[j]);
                    index = j;
                }
            }
        }
        System.out.println(index);
    }
}
