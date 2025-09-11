package String;

public class NumberOfSegment {
    public static void main(String[] args) {
       int arr[] = {32,21,15,42,1,6,90,92};
        int k = 42;
        int index = 0;
       for(int i = 0; i<arr.length; i++){
            if(arr[i] == k){
                index = i;
            }
       }
       System.out.println(index);
    }
}
