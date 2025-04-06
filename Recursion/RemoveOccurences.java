package Recursion;

public class RemoveOccurences {
    public static void main(String[] args) {
        String s = "krish gupta";      
        System.out.println(remove(s, 0));
        System.out.println(removel(s));
    }
    static String remove(String s, int idx){
        if(idx == s.length()) return "";
        String smallAns = remove(s, idx+1);
        char cur = s.charAt(idx);
        if(cur != 'a'){
            return cur + smallAns;
        }
        else{
            return smallAns;
        }
    }

    static String removel(String s){
        if(s.length() == 0) return "";
        String smallAns = removel(s.substring(1));
        char cur = s.charAt(0);
        if(cur != 'a'){
            return cur + smallAns;
        }
        else{
            return smallAns;
        }
    }

}
