package Array;

public class AverageSalaryExcludingtheMinimumandMaximumSalary {
    public static void main(String[] args) {
        int[] salary = {8000,9000,2000,3000,6000,1000};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum  = 0;
        double avg = 0; 
        int n = salary.length;
        for(int i = 0; i<salary.length; i++){
            sum += salary[i];
            max = Math.max(max, salary[i]);
            min = Math.min(min, salary[i]);
        }
        sum -= (min+max);
        avg = (double)sum/(n-2);
        System.out.println(avg);
    }
}
