package Recursion;

public class SumOfdigits {
    public static void main(String[] args) {
        System.out.println(sOFD(987654));
        System.out.println(counter(143454,0));
    }
    static int sOFD(int n){
        //base cse
        if(n>=0 && n<=9){
            return n;
        }
        return sOFD(n/10) + n%10;
    }

    static int counter(int n, int count){
        if(n>=0 && n<=9){
            return count;
        }

        return counter(n/10, count+1);
    }
}
