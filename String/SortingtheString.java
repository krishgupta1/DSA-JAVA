package String;

public class SortingtheString {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";

        String[] strings = s.split(" ");
        String[] reStrings = new String[strings.length]; 

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                char c = strings[i].charAt(j);
                if (Character.isDigit(c)) {
                    int index = Character.getNumericValue(c) - 1;
                    reStrings[index] = strings[i].substring(0, strings[i].length() - 1);
                    break;
                }
            }
        }
    }
}