package String;

public class CheckIfaWordOccursAsaPrefixofAnyWordinaSentence {
    public static void main(String[] args) {
        String sentence = "i love eating burger", searchWord = "burg";
        int position = 0;
        boolean found = false;
        String[] string = sentence.split(" ");
        for(int i = 0; i <string.length; i++){
            if(string[i].startsWith(searchWord)){
                position = i+1;
                found = true;
            }
            
        }
        System.out.println(position);
    }
}
