package GreedyAlgorithm;

public class JobSequencing {
    static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
            
        }
    }
    public static void main(String[] args) {
        int jobInfo[][] = {{4,20}, {1,10}, {1,40}, {1,30}};
        Job jobs[] = new Job[jobInfo.length];
        for(int i = 0; i<jobs.length; i++){
            jobs[i] = new Job(i, jobInfo[i][0], jobInfo[i][1]);
            
        }
    }
}
