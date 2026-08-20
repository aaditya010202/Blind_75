class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        
        List<List<Integer>> list = new ArrayList<>();
        for(int i =0;i<nums.length-2;i++) {
            Integer j = i+1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            Integer k = nums.length-1;
            while(j<k) {
                Integer sum = nums[i]+nums[j]+nums[k];
                if(sum==0) {
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    list.add(l);
                    j++;
                    while(nums[j]==nums[j-1] && j<k) j++;
                } else if(sum<0) {
                    j++;
                } else {
                    k--;
                }
                
            }
        }

        return list;
    }
}
