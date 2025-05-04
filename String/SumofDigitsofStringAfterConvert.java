package String;

public class SumofDigitsofStringAfterConvert {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        String str = "";
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            int temp = (int)ch;
            int temp_int = 96;
            if(temp<=122 && temp>=97){
                String addString = String.valueOf(temp - temp_int);
                str += addString;
            }
        }
        int res = 0;
        for(int i = 1; i<=k; i++){
            res = 0;
            for(int j = 0; j<str.length(); j++){
                char c = str.charAt(j);
                int addvalue = Integer.parseInt(String.valueOf(c));
                res += addvalue;
            }
            str = String.valueOf(res);
        }
            
        System.out.println(res);
    }
}