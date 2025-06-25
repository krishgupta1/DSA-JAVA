package String;

public class CountingWordsWithaGivenPrefix {
    public static void main(String[] args) {
        String words[] = {"leetcode","win","loops","success"};
        String pref = "code";

        String newStr = new String();
        int count = 0;
        for(int i = 0; i<words.length; i++){
            if(words[i].startsWith(pref)){
                count++;
            }
            // String str = words[i]; // "leetcode"
            // for(int j = 0; j<pref.length()-1; j++){
            //     char c = str.charAt(j);
            //     newStr += c;
            // }
            // if(pref.equals(newStr)){
            //     count ++;
            // }
        }
        System.out.println(count);
    }
}
