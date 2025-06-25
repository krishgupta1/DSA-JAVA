package String;

public class CountingVowel {
    public static void main(String[] args) {
        String s = "abc de";
        s.toLowerCase();
        int vowelCount = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                System.out.println(ch);
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
}
