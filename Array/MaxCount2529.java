package Array;

public class MaxCount2529 {
    public static void main(String[] args) {
        int[] nums = {0};
        int negCount = 0;
        int posCount = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]<0){
                negCount++;
            }
            else if(nums[i]>0){
                posCount++;
            }
        }
        if(negCount>posCount){
            System.out.println(negCount);
        }
        else {
            System.out.println(posCount);
        }
    }
}
