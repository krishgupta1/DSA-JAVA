package String;
import java.util.*;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        String emails[] = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        HashSet<String> set = new HashSet<>();
        for(String s : emails){
            String parts[] = s.split("@");
            String local = parts[0];
            String domain = parts[1];
            StringBuilder builder = new StringBuilder();
            for(int i = 0; i < local.length(); i++){
                if(local.charAt(i) == '+'){
                    break;
                }
                if(local.charAt(i) != '.'){
                    builder = builder.append(local.charAt(i));
                }
            }
            builder.append('@');
            builder.append(domain);
            set.add(builder.toString());
        }
        System.out.println(set.size());
    }
}
