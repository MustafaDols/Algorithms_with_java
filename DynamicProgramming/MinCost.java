package DynamicProgramming;

public class MinCost {
    public static void main(String[] args) {
        int [] cost = {10,15,20};
        System.out.println(minCost(cost));

    }
    public static int minCost(int [] cost){
        int [] dp = new int[cost.length+1];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for (int i=2 ;i<cost.length;i++){
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        dp[cost.length] = Math.min(dp[cost.length-2],dp[cost.length-1]);
        return dp[cost.length];
    }

}
