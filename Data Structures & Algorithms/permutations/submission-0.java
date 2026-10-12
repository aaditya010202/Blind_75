class Solution {
    public void swap(int[] nums, int ind1, int ind2){
        int temp = nums[ind1];
        nums[ind1] = nums[ind2];
        nums[ind2] = temp;
    }
    public void compute(int[] nums, int i, List<List<Integer>> ans) {
        
        if(i==nums.length) {
            List<Integer> temp = new ArrayList<>();
            for(int k: nums){
                temp.add(k);
            }
            ans.add(temp);
            return;
        }

        for(int j =i;j<nums.length;j++) {
            swap(nums, i, j);
            compute(nums, i+1, ans);
            swap(nums, j, i);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        compute(nums, 0, ans);    
        
        return ans;

    }
}