package Recursion;

import java.util.ArrayList;

public class SubString {
    public static void main(String[] args) {
        String s = "123";
        // System.out.println(getSSQ(s).toString());
        printSSQ(s, "");
    }
    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.length()  == 0){
            ans.add("");
            return ans;
        }
        char curr = s.charAt(0);
        ArrayList<String> small =  getSSQ(s.substring(1));
        for(String ns : small){
            ans.add(ns);
            ans.add(curr+ns);
        } 
        return ans;
    }


    static void printSSQ(String s, String curAns){
        if(s.length()  == 0){
            System.out.println(curAns);
            return;
        }
        char current = s.charAt(0);
        String remString = s.substring(1);
        printSSQ(remString, curAns + current);
        printSSQ(remString, curAns);
    }
}
