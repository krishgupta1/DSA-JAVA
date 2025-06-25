package String;

public class NumberOfChangingKeys {
    public static void main(String[] args) {
        String s = "aAbBcC".toLowerCase();
        String newStr = s.toLowerCase();
        int counter = 0;
        for(int i = 0; i<newStr.length()-1; i++){
            char c = newStr.charAt(i);
            char c2 = newStr.charAt(i+1);

            if(c != c2){
                counter ++;
            }
        }
        System.out.println(counter);
    }
}
