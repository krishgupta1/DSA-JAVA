package Array;

public class containerWithMostWater {
    public static void main(String[] args) {
        int []height = {1,8,6,2,5,4,8,3,7};
        int left = 0;
        int right = height.length - 1;
        int result = 0;

        while(left < right){
            int width = right - left;
            int h = Math.min(height[left] , height[right]);

            result = Math.max(result, width * h);
            
            if(left < right){
                left ++;
            }
            else{
                right--;
            }
        }
        System.out.println(result);
    }
}
