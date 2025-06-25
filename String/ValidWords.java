package String;

public class ValidWords {
    public static void main(String[] args) {
        String word = "234A";
        int count = 0;
        int count1 = 0; 
        int len = word.length();

        for(int i = 0; i<len; i++){
            char c = word.charAt(i);
            if((c >= 'a' && c<= 'z') || (c >= 'A' && c<= 'Z')){
                c = Character.toLowerCase(c);
                if((c == 'a') ||( c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')){
                    count++;
                }
                else{
                    count1++;
                }
            }
            else if(c >= '0' && c <= '9'){
                continue;
            }
            else{
                // System.out.println("False");
            }
        }
        if(count > 0 && count1 > 0 ) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
        // System.out.println(count > 0 && count1 > 0);
    }
}
