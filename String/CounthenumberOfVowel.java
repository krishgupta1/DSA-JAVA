package String;

public class CounthenumberOfVowel {
    public static void main(String[] args) {
        String []words ={"are","amy","u"};
        int left = 0, right = 2;
        int count = 0;

        for(int i = left; i<=right; i++){
            String s = words[i].toLowerCase();
            char c1 = s.charAt(0);
            char c2 = s.charAt(s.length()-1);
            if( c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o'|| c1 == 'u' &&
                c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o'|| c2 == 'u' ){
                count++;
            }
        }
        System.out.println(count);
    }
}
