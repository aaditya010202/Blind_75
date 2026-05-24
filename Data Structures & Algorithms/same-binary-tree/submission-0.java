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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();

        if(p == null && q != null) return false;
        else if(q == null && p != null) return false;
        else if (p == null && q == null) return true;

        q1.add(p);
        q2.add(q);

        while(!q1.isEmpty() || !q2.isEmpty()) {
            Integer size = q1.size();
            Integer size2 = q2.size();
            if(size != size2) return false;
            for(int i=0;i<size;i++) {
                TreeNode node = q1.poll();
                TreeNode node2 = q2.poll();
                if(node.val != node2.val) return false;

                TreeNode left = node.left;
                TreeNode right = node.right;
                TreeNode left2 = node2.left;
                TreeNode right2 = node2.right;

                if(left == null && left2 != null) return false;
                if(left2 == null && left != null) return false;

                if(right == null && right2 != null) return false;
                if(right2 == null && right != null) return false;
                
                // if(left.val != left2.val) return false;
                // if(right.val != right2.val) return false;
                
                if(left!=null) q1.add(left);
                if(right!=null) q1.add(right);

                if(left2!=null) q2.add(left2);
                if(right2!=null) q2.add(right2);

            }

        }
        return true;
    }
}
