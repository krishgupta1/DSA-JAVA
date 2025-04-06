package Recursion;
import java.util.Scanner;

public class PrintNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        printIncreasing(n);
    }

    static void printIncreasing(int n ){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printIncreasing(n-1);
    }
} 