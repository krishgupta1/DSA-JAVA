package BitManipulation;

public class coding {
    public static void main(String[] args) {
        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5 ^ 6);
        System.out.println(~5  );
        System.out.println(5<<2 );
        System.out.println(5>>2);

        System.out.println("Odd OR Even");
        int n = 5;
        int bitMask = 1;
        if((n&bitMask) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        //Get ith Position
        int i = 2;
        int bitMask2 = 1<<i;
        if((12 & bitMask2) == 0){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }
}
