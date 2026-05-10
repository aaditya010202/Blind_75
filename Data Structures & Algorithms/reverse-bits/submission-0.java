class Solution {
    public int reverseBits(int n) {
        int ans = 0;
        for(int i =0;i<32;i++) {
            int res = (n >> i) & 1 ;
            ans |= (res << (31-i));
        }
        return ans;
    }
}
