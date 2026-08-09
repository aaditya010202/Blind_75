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
    Integer res = 0;
    public int dfs(TreeNode node) {
        if(node == null) return 0;
        Integer left = dfs(node.left);
        Integer right = dfs(node.right);
        res = Math.max(left+right, res);

        return 1 + Math.max(left, right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }
}
