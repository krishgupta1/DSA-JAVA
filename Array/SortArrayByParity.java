package Array;
import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int nums[] = {4,2,5,7};
        int result[] = new int[nums.length];
        int even = 0;
        int odd = 1;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                result[even] = nums[i];
                even += 2;
            }
            else{
                result[odd] = nums[i];
                odd += 2;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
