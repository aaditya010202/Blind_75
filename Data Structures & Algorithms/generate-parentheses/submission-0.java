class Solution {
    public void dfs(int l, List<String> ans, String temp, Integer balance) {
        if(temp.length() == l && balance == 0) {
            ans.add(temp);
            return;
        } else if(temp.length() == l && balance != 0) return; 
        else if(balance < 0 || balance > l/2) return;

        dfs(l, ans, temp + "(", balance+1);
        dfs(l, ans, temp + ")", balance-1);

    }
    public List<String> generateParenthesis(int n) {
        Integer len = 2*n;
        List<String> ans = new ArrayList<>();
        String temp = "";
        dfs(len, ans, temp, 0);
        return ans;

    }
}
