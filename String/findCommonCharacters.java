package String;

public class findCommonCharacters {
    public static void main(String[] args) {
        String words[] = {"bella","label","roller"};
        int c = 0;
        for(int i = 0; i<words.length; i++){
            for(int j = 0; j<words[i].length(); j++){
                char ch = words[i].charAt(j);
                if(words[i].contains(Character.toString(ch))){
                    c++;
                    System.out.println(ch);
                }
            }
        }
        System.out.println(c);
    }
}
