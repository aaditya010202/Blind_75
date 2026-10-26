class Solution {
    public boolean isPalindrome(String s, Integer l, Integer r) {
        while(l<r) {
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public void dfs(Integer i, String s, List<String> temp, List<List<String>> ans) {
        if(i>=s.length()) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int j=i;j<s.length();j++) {
            if(isPalindrome(s, i, j)) {
                temp.add(s.substring(i, j+1));
                dfs(j+1 ,s, temp, ans);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        dfs(0, s, temp, ans);
        return ans;
    }
}
