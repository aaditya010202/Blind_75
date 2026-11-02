class Solution {
    public int calc(int[] nums, int[] dp, Integer i) {
        if(i>=nums.length) return 0;

        if(dp[i] != -1) {
            return dp[i];
        }

        dp[i] = nums[i] + Math.max(calc(nums, dp, i+2), calc(nums, dp, i+3));
        return dp[i];
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            dp[i] = -1;
        }
        int left = calc(nums, dp, 0);
        int right = calc(nums, dp, 1);
        return Math.max(left, right);
    }
}
