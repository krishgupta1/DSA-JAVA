package Backtracking;
public class FindSubset {
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
    public static void findSubsets(String str, String ans, int i){
        //Base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{   
                System.out.println(ans);
            }   
            return;
        }

        //Recursion
        //Yes Choice
        findSubsets(str, ans+str.charAt(i), i+1);
        //No Choice
        findSubsets(str, ans, i+1);
    }
} 
