package String;

public class WaterBottle {
    public static void main(String[] args) {
        int numBottles = 9, numExchange = 3;
        int total = numBottles;
        int empty = numBottles;
        while(empty>=numExchange){
            int newFull = empty/numExchange;
            total = total + newFull;
            empty = empty % numExchange + newFull;
        }
        System.out.println(total);
    }
}
