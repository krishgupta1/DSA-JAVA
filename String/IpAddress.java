package String;

public class IpAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        char dot = '.';
        String result = new String();

        for(int i = 0; i<address.length(); i++){
            char c = address.charAt(i);
            if(c == dot){
                result += "[.]";
            }
            else{
                String str = String.valueOf(c);
                result += str;
            }
        }
        System.out.println(result);
    }
    
}