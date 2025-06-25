package String;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        String num = "123";
        int number = Integer.parseInt(num);
        if(number % 2 == 0){
            for(int i = 0; i<num.length(); i++){
                char c = num.charAt(i);
                if(c % 2 != 0){
                    System.out.println(c);;
                }
                else{
                    System.out.println(" ");
                }
            }
        }
        else{
            System.out.println(num);
        }
    }
}
