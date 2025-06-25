package Array;

public class LeastAtLeastTwice{
    public static void main(String[] args) {
        int[] nums = {3,6,1,0};
        int max = 0;
        int index = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(i != index && nums[i] *2 > max){
                System.out.println(-1);
            }
        }
        System.out.println(index);
    }
}