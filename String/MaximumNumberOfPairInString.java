package String;

public class MaximumNumberOfPairInString {
    public static void main(String[] args) {
        String[]  words = {"cd","ac","dc","ca","zz"};
        int counter = 0;
        for(int i = 0; i<words.length; i++){
            StringBuilder stringBuilder = new StringBuilder(words[i]);
            stringBuilder.reverse();
            String coString = stringBuilder.toString();
            for(int j = i+1; j < words.length; j++){
                if(coString.equals(words[j])){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
