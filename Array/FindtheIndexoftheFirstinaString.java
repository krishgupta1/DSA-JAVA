package Array;

public class FindtheIndexoftheFirstinaString {
    public static void main(String[] args) {
    String haystack = "leetcode";
    String needle = "leeto";
    

    for(int i = 0; i<haystack.length(); i++){
        if(haystack.contains(needle)){
            System.out.println(i);
            break;
        }
        else{
            System.out.println(-1);
            break;
        }
        // char haystackChar = haystack.charAt(i);
        // for(int j = 0; j<needle.length(); j++){
        //     char needleChar = needle.charAt(j);
        //     if()
        // }
    }
    }
}
