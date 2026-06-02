class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        
        Integer l = 0;
        Integer res = 0;

        for(int i = 0;i< s.length();i++) {
            while(set.contains(s.charAt(i))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            res = Math.max(res, set.size());
        }

        return res;
    }
}
