class Solution {
    public boolean dfs(int i, int j, String word, char[][] board, int curr, Set<Pair<Integer, Integer>> path) {
        if(curr == word.length()) {
            return true;
        }
        if(i<0 || i>= board.length || j<0 || j>=board[0].length 
        || word.charAt(curr)!=board[i][j] || path.contains(new Pair<>(i, j))) {
            // curr=0;
            return false;
        }
        
        path.add(new Pair<>(i, j));
        boolean flag = dfs(i+1, j, word, board, curr+1, path) ||
        dfs(i, j+1, word, board, curr+1, path) || dfs(i-1, j, word, board, curr+1, path) ||
        dfs(i, j-1, word, board, curr+1, path);
        path.remove(new Pair<>(i, j));

        return flag;

    }
    public boolean exist(char[][] board, String word) {
        
        Integer r = board.length;
        Integer c = board[0].length;
        Set<Pair<Integer, Integer>> path = new HashSet<>();
        for(int i =0 ;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(dfs(i, j, word, board, 0, path)) return true;
            }
        }
        return false;
    }
}
