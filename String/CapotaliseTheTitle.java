package String;

public class CapotaliseTheTitle {
    public static void main(String[] args) {
        String title = "capiTalIze tHe titLe";

        String newStr[] = title.toLowerCase().split(" ");
        StringBuilder builder = new StringBuilder();
        String capital;
        for(int i = 0; i<newStr.length; i++){
            if(newStr[i].length() > 2){
                char c = newStr[i].charAt(0);
                capital = String.valueOf(c).toUpperCase();
                builder.append(capital).append(newStr[i].substring(1));
            }
            else{
                builder.append(newStr[i]);
            }
            
            if(i != newStr.length - 1){
                builder.append(" ");
            }
        }
        System.out.println(builder.toString());
    }
}
