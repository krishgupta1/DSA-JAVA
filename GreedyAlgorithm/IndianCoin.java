package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class IndianCoin {
    public static void main(String[] args) {
        Integer coin[] = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coin, Comparator.reverseOrder());
        int amount = 590; // 90
        int count = 0;
        for(int i = 0; i<coin.length; i++){
            if(coin[i]<amount){
                while (coin[i]<=amount) {
                    count++;
                    amount -= coin[i];
                }
            }
        }
        System.out.println(count);
    }
}
