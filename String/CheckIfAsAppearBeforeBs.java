package String;

public class CheckIfAsAppearBeforeBs {
    public static void main(String[] args) {
        String s = "aaabbb";
        boolean bool = true;
        if(s.contains("ba")){
            bool = false;
        }
        System.out.println(bool);
    }
}
