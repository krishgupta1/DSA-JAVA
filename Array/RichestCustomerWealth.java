package Array;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        int max = 0;
        for(int i = 0; i<accounts.length; i++){
            int sum = 0;
            for(int j = 0; j<accounts[i].length; j++){
                sum += accounts[i][j];
                if(max < sum){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
