package String;

public class percentageOfLetterinString {
    public static void main(String[] args) {
        String s = "sgawtb";
        char letter = 's';
        float size = s.length();
        System.out.println(size);
        float count = 0;
        for(int i = 0; i<size; i++){
            if(s.charAt(i) == letter){
                count++;
            }
        }
        System.out.println(count);
        float percentage = ((count/size) * 100);
        System.out.println(percentage);
        System.out.println((int)Math.round(percentage));
    }
}
