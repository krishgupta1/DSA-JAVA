package String;

public class shuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        char result[] = s.toCharArray();
        for(int i = 0; i<indices.length; i++){
            result[indices[i]] = s.charAt(i);
        }
        System.out.println(result);
    }
}
