class Solution {
    public int characterReplacement(String s, int k) {
        Integer len = s.length();
        Integer res = 0;
        HashSet<Character> set =  new HashSet<>();
        for(int i =0; i<len; i++) {
            set.add(s.charAt(i));
        }


        for(Character c: set) {
            Integer count = 0;
            Integer left = 0;
            for(int i=0;i<len;i++) {
                if(s.charAt(i)==c) count++;
                
                while((i-left+1)-count > k) {
                    if(s.charAt(left) == c) count--;
                    left++;
                }
                res = Math.max(res, i-left+1);
            }
        }
        return res;
    }
}
