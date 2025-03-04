package String;

public class CountTheNumberOFConsistantString {
    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = { "a", "b", "c", "ab", "ac", "bc", "abc" };
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            boolean bool = false;
            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j);
                for (int k = 0; k < allowed.length(); k++) {
                    char cAll = allowed.charAt(k);
                    if (c == cAll) {
                        bool = true;
                        break;
                    } else {
                        bool = false;
                    }
                }
                if (!bool) {
                    break;
                }
            }
            if (bool) {
                count++;
            }
        }

        System.out.println(count);
    }
}