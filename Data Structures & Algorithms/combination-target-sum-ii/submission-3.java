class Solution {
    public void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> temp, int i) {
        if(target==0) {
            // if(!ans.contains(temp))
             ans.add(new ArrayList<>(temp));
            return;
        }
        if(i>=candidates.length || target<0) return;

        temp.add(candidates[i]);
        dfs(candidates, target-candidates[i], ans, temp, i+1);

        temp.remove(temp.size()-1);
        while (i + 1 < candidates.length && candidates[i] == candidates[i + 1]) {
            i++;
        }
        dfs(candidates, target, ans, temp, i+1);

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(candidates, target, ans, temp, 0);
        return ans;
    }
}
