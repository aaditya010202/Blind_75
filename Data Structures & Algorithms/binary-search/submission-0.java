class Solution {
    public int search(int[] nums, int target) {
        Integer start = 0;
        Integer end = nums.length-1;
        Integer mid = (end+start)/2;
        while(start<=end) {
            if(nums[mid]==target) return mid;
            else if(nums[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
            mid = (end+start)/2;
        }
        return -1;
    }
}
