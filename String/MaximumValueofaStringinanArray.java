package String;

import java.util.ArrayList;

public class MaximumValueofaStringinanArray {
    public static void main(String[] args) {
        String strs[] = {"alic3","bob","3","4","00000"};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            Boolean bool = true;
            String string = strs[i];
            for (int j = 0; j < string.length(); j++) {
                char c = string.charAt(j);
                if (Character.isLetter(c)) {
                    list.add(strs[i].length());
                    bool = false;
                    break;
                }
            }
            if(bool){
                int num = Integer.parseInt(string);
                list.add(num);
            }
        }

        int max = 0;
        for(int i = 0; i<list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println(max);

    }
}
