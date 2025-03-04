package String;

public class RemoveTrailingZerosFromString {
    public static void main(String[] args) {
        int n = 4;
        String a = "";
        if(n % 2 == 1){
            System.out.println("a".repeat(n));
        }
        else{
            a = "a".repeat(n-1);
        }
        System.out.println(a+"b");
    }
}