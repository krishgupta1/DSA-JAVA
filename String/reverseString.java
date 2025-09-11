package String;

public class reverseString {
    public static void main(String[] args) {
        String s = "Krish Gupta";
        char[] ch = s.toCharArray();
        char[] newStr = new char[s.length()];
        int index=0;
        for(int i = ch.length-1; i>=0; i--){
            newStr[index]= ch[i];
            index++;
        }
        System.out.println(newStr);
    }
}
