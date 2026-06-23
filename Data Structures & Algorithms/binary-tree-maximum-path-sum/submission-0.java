/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    Integer ans = 0;
    public int dfs(TreeNode node) {
        if(node == null) return 0;
        Integer left = dfs(node.left);
        Integer right = dfs(node.right);
        left = Math.max(left, 0);
        right = Math.max(right, 0);
        ans = Math.max(ans, node.val + left + right);
        return node.val + Math.max(left, right);
    }
    public int maxPathSum(TreeNode root) {
        ans = root.val;
        dfs(root);
        return ans;
    }
}
