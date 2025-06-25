package Array;

public class CountGoodTripplet {
    public static void main(String[] args) {
        int[] arr = {3,0,1,1,9,7};
        int a = 7, b = 2, c = 3;
        int res = 0;
        for(int i = 0; i<=arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                for(int k = j + 1; k<arr.length; k++){
                    if((Math.abs(arr[i]-arr[j]) <= a) && (Math.abs(arr[j] -  arr[k])<=b) && Math.abs(arr[i] - arr[k])<=c){
                        res++;
                    }
                }
            }
        }
        System.out.println(res);
    }
}