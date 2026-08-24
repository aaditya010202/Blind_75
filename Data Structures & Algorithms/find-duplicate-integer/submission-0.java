class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Integer max =  0;
        Integer ans = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                ans = entry.getKey();
            }
        }

        return ans;
    }
}
