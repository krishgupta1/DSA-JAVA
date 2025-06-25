package Array;

public class FindCommonElementInTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {2,3,2}, nums2 = {1,2};
        int[] arr = new int[2];
        int a = 0;
        int b = 0;
        for(int i = 0; i<nums1.length; i++){
            for(int j = 0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    a++;
                    break;
                }
            }
        }
        for(int i = 0; i<nums2.length; i++){
            for(int j = 0; j<nums1.length; j++){
                if(nums2[i] == nums1[j]){
                    b++;
                    break;
                }
            }
        }
        arr[0] = a;
        arr[1] = b;

        System.out.println(a);
        System.out.println(b);
    }
}