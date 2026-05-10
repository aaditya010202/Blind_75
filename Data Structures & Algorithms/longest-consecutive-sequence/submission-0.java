class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> setOfNums = new HashSet<>();
        for(int i: nums){
            setOfNums.add(i);
        }

        Integer ans = 0;
        for(int i: nums) {
            
            if(!setOfNums.contains(i-1)) {
                Integer length = 0;
                while(setOfNums.contains(i+length)) {
                    length++;
                }
                ans = Math.max(ans, length);
            }
        }
        return ans;
    }
}
