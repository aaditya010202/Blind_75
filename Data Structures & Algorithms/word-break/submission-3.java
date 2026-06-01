class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> dict = new HashSet<>(wordDict);
        Integer maxlen = 0;
        for(String d: dict) {
            maxlen = Math.max(d.length(), maxlen);
        }

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for(int i = 1;i<=s.length();i++) {
            for(int j = i-1; j>=Math.max(i - maxlen, 0); j--) {
                if(dict.contains(s.substring(j, i)) && dp[j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
