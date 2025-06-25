package String;

public class AddingSpaceToString {
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8, 13, 15};
        char[] c = s.toCharArray();
        StringBuilder newStr = new StringBuilder();
        int spaceIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (spaceIndex < spaces.length && i == spaces[spaceIndex]) {
                newStr.append(" ");
                spaceIndex++;
            }
            newStr.append(c[i]);
        }

        System.out.println(newStr.toString());
    }
}
