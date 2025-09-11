package Recursion;

public class multiples {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int k = sc.nextInt();
        // printMultiples(n, k);
        System.out.println(seriesSum3(5));
    }

    static void printMultiples(int n, int k){
        if(k==0){
            return;
        }
        printMultiples(n, k-1);
        System.out.println(n*k);
    }

    static int seriesSum3(int n){
        if(n==0) return 0;
        if(n%2 == 0){
            return seriesSum3(n-1) - n;
        }
        else{
            return seriesSum3(n-1) + n;
        }
    }
}