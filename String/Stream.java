package String;

public class Stream {
    public static void main(String[] args) {
        skip("", "baccdah");
        String s = "abcd";
        System.out.println(skipApple("kriappleery"));
        System.out.println(skipAppNotskipApple("qwerappplo"));
        System.out.println(skipAppNotskipApple("qwerapplefglo"));
    }
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));
        }
        else{
            skip(p + ch, up.substring(1));
        }
    }

    static String skipApple( String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(3));
        }
        else{
            return up.charAt(0) + skipApple(up.substring(1));  
        }
    }

    static String skipAppNotskipApple( String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple") && !up.startsWith("apple")){
            return skipAppNotskipApple(up.substring(3));
        }
        else{
            return up.charAt(0) + skipApple(up.substring(1));  
        }
    }
}
