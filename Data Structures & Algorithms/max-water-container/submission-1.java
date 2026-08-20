class Solution {
    public int maxArea(int[] heights) {
        Integer ans = 0;
        Integer size = heights.length;
        Integer l = 0;
        Integer r = size-1;
        while(l<r) {
            ans = Math.max(ans, (r-l) * Math.min(heights[l], heights[r]));
            if(heights[l]<=heights[r])l++;
            else r--;
        }
        return ans;
    }
}
