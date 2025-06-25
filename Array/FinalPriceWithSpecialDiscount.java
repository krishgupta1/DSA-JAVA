package Array;

import java.util.Arrays;

public class FinalPriceWithSpecialDiscount {
    public static void main(String[] args) {
        int prices[] = {8,4,6,2,3};
        int result[] = new int[prices.length];
        for(int i = 0; i<prices.length; i++){
            result[i] = prices[i];
            for(int j = i+1; j<prices.length; j++){
                if(prices[j]<=prices[i]){
                    result[i] = prices[i] - prices[j];
                    break;
                }
                
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
