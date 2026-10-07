class Solution {
    public void dfs(int[] nums, int target, List<List<Integer>> ans, List<Integer> temp, Integer tempSum, Integer index) {

        if(tempSum == target) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(tempSum>target || index>=nums.length) return;
        dfs(nums, target, ans, temp, tempSum, index+1);
        temp.add(nums[index]);
        dfs(nums, target, ans, temp, tempSum+nums[index], index);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(nums, target, ans, temp, 0, 0);
        return ans;
    }
}
