package Array;

public class CountPartiotionaWithEverySum {

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        int counter = 0;
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            int total = 0;
            sum+=nums[i];
            for(int j = i+1; j<nums.length; j++){
                total += nums[j];
                
                if(j== nums.length-1){
                    if((sum - total)%2 == 0){
                        counter++;
                        break;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}