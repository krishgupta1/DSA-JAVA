package String;

public class FinalofAfterOperations {
    public static void main(String[] args) {
        String[] operations = {"++X","++X","X++"};
        int result = 0;
        for(int i = 0; i<operations.length; i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                result++;
            }
            else{
                result--;
            }
        }
        System.out.println(result);
    }   
}
