class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(0);
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<int[]> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> m: map.entrySet()) {
            list.add(new int[]{m.getValue(), m.getKey()});
        }
        list.sort((a,b) -> b[0] - a[0]);
        
        int[] ans = new int[k];
        for(int i =0;i<k;i++) {
            ans[i] = list.get(i)[1];
        }
        return ans;
    }
}
