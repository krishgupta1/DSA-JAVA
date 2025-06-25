package Hashing;

public class JewelsandStone {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        
        jewels.toCharArray();
        stones.toCharArray();
        int count = 0 ;
        for(int i = 0 ; i < jewels.length(); i++){
            for(int j = 0; j < stones.length(); j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
