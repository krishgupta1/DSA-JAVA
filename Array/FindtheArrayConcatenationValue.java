package Array;

public class FindtheArrayConcatenationValue {
    public static void main(String[] args) {
        int nums[] = {7,52,2,4};
        int ans = 0;
        int left = 0;
        int right = nums.length - 1;
        while(left<=right){
            String value = String.valueOf(nums[left]) + String.valueOf(nums[right]);
            int val = Integer.parseInt(value);
            ans+=val;
            left++;
            right--;
        }
        if(left == right){
            ans+=nums[left];
        }
        System.out.println(ans);
    }
}
