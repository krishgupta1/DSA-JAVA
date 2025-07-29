package Stack;
import java.util.Arrays;

public class NextGreaterElementII {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,3};
        int newArr[] = nums.clone();
        int res[] = new int[nums.length];
        int idx = 0;
        
        for(int i = 0; i<=nums.length-1; i++){
            for(int j = 0; j <=newArr.length-1; j++){
                if(nums[j] > nums[i] ){
                    res[i] = nums[j];
                }
                else{
                    res[i] = -1;
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }

}
