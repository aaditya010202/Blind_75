
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums) {
            if(map.get(i) == null) {
                map.put(i, 1);
            } else {
                return true;
            }
        }
        return false;
    }
}