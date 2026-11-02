class Solution {
    Integer ans = Integer.MAX_VALUE;
    // Recursion
    // public void calc(int[] cost, Integer i, Integer temp) {    
    //     if(i>=cost.length) {
    //         ans = Math.min(temp, ans);
    //         return;
    //     }
    //     temp += cost[i];
    //     calc(cost, i+1, temp);
    //     calc(cost, i+2, temp);
    // }

    // public int minCostClimbingStairs(int[] cost) {
    //     calc(cost, 0, 0);
    //     calc(cost, 1, 0);
    //     return ans;
    // }

    public int calc(int[] cost, int[] dp, Integer i) {
        if(i>=cost.length) {
            return 0;
        }
        if(dp[i] !=-1) {
            return dp[i];
        }

        dp[i] = cost[i] + Math.min(calc(cost, dp, i+1), calc(cost, dp, i+2));
        return dp[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        for(int i=0;i<dp.length;i++) {
            dp[i] = -1;
        }
        int left = calc(cost, dp, 0);
        int right = calc(cost, dp, 1);
        return Math.min(left, right);
    }
}
