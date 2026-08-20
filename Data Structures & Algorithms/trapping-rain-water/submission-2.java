class Solution {
    public int trap(int[] height) {
        Integer size = height.length;
        Integer ans = 0;
        int[] leftMax = new int[size];
        int[] rightMax = new int[size];
        Integer temp = 0;
        for(int i=1;i<size;i++) {
            temp = Math.max(temp, height[i-1]);
            leftMax[i] = temp;
        }
        temp = 0;
        for(int j=size-2;j>0;j--) {
            temp = Math.max(temp, height[j+1]);
            rightMax[j]= temp;
        }

        for(int i=0;i<size;i++) {
        
            ans += Math.max(0, Math.min(leftMax[i], rightMax[i]) - height[i]);
        }
        return ans;
    }
}
 