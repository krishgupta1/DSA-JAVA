package Searching;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,5,3,7,6};
        int low = nums[0];
        int high = nums.length - 1;
//        int index = 0;
//        for(int i = 1; i<nums.length; i++){
//            if(nums[i] > nums[i-1]){
//                index = i;
//            }
//        }
//        System.out.println(index);

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);;

    }
}
