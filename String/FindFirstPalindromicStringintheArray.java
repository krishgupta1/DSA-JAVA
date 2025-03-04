package String;

public class FindFirstPalindromicStringintheArray {
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        String str = "";
        for(int i = 0; i<words.length; i++){
            StringBuilder builder = new StringBuilder(words[i]);
            if(words[i].equals(builder.reverse().toString())){
                str = words[i];
                break;
            }
        }
        System.out.println(str);
    }
}
