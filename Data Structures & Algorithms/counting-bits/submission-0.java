class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0;i<=n;i++) {
            String bits = Integer.toBinaryString(i);
            int len = 0;
            for(int j=0;j<bits.length();j++) {
                if(bits.charAt(j)=='1') len++;
            }
            ans[i]=len;
        }
        return ans;
    }
    
}
