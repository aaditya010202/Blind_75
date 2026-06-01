class Solution {
    public int findMin(int[] nums) {
        Integer l = 0;
        Integer h = nums.length - 1;
        Integer min = Integer.MAX_VALUE;
        while(l<=h) {
            Integer mid = (l+h)/2;
            
            if(nums[l] <= nums[mid]) {
                min = Math.min(min, nums[l]);
                l = mid + 1;
            } else {
                min = Math.min(min, nums[mid]);
                h = mid -1;
            }
        }

        return min;
    }
}
