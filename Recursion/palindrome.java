package Recursion;

public class palindrome {
    public static void main(String[] args) {
        String s = "dadadadadad";
        System.out.println(palin(s,0,s.length()-1));

    }
    static boolean palin(String s, int l, int r){
        if(l>=r){
         return true;
        }
        return (s.charAt(l) == s.charAt(r)  && palin(s,l+1,r-1));
    }
}    