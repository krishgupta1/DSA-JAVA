package Math;

public class commonFactors {
    public static void main(String[] args) {
        int a = 885, b = 885;
        int helper;
        if(a>b){
            helper = a;
        }
        else{
            helper = b;
        }
        int res=0;
        for(int i = 1; i<=helper; i++){
            if(a % i == 0 && b % i == 0){
                res+=1;;
            }
        }
        System.out.println(res);
    }
} 
