package Array;

public class elementAppear {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
        int per = (int) (0.25 * arr.length);
        int count=0;
        int result = 0;
        for(int i = 0 ;i <arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                count++;
                if(count>per){
                    result = arr[i];
                }
            }
        }
        System.out.println(result);
    }
}
