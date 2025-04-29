package Array;

public class ArrayAwayFromKPlaces {
    public static void main(String[] args) {
        int nums[] = {1,0,0,0,1,0,0,1};
        int k = 2;
        int count = k;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                if(count<k){
                    System.out.println(false);
                }
                count = 0;
            }
            else{
                count++;
            }
        }
        System.out.println(true);
    }
}
