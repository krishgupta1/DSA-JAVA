package Array;

public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {3,1,7,11};

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                for(int k = j+1; k<arr.length; k++){
                    if(arr[i] == arr[j]*2){
                        System.out.println("true");
                        break;
                    }
                }
            }
        }
    }
}
