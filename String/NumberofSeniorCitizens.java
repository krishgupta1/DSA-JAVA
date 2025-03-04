package String;

public class NumberofSeniorCitizens{
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int count = 0;
        for(int i = 0; i<details.length; i++){
            //Optimal Approach
            String string = details[i].substring(11, 13);

            // String str = details[i];
            // char c = str.charAt(11);
            // char ch = str.charAt(12);
            // String s1 = String.valueOf(c);
            // String s2 = String.valueOf(ch);
            // String result = s1 + s2;
            int age = Integer.parseInt(string);
            if(age > 60){
                count++;
            }
        }
        System.out.println(count);
    }
}