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
    public int maxDepth(TreeNode root) {
        Integer max = 0;
        if(root==null) return 0;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);

        while(!nodes.isEmpty()) {
            Integer size = nodes.size();
            for(int i=0;i<size;i++) {
                TreeNode node = nodes.poll();
                TreeNode left = node.left;
                TreeNode right = node.right;
                if(left!=null) nodes.add(left);
                if(right != null) nodes.add(right);
        }
            max++;
        }

        return max;
    }
}
