class Solution {
    public void dfs(int[] nums, Set<List<Integer>> ans, List<Integer> temp, int i) {
        if(i==nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        } 
        
        temp.add(nums[i]);
        dfs(nums, ans, temp, i+1);
        temp.remove(temp.size()-1);
        dfs(nums, ans, temp, i+1);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        dfs(nums, ans, temp, 0);
        return new ArrayList<>(ans);
    }
}
