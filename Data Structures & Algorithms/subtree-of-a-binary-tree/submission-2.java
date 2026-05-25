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
    public boolean subTree(TreeNode node, TreeNode subRoot) {
        Queue<TreeNode> n1 = new LinkedList<>();
        Queue<TreeNode> n2 = new LinkedList<>();
        n1.add(node);
        n2.add(subRoot);

        while(!n1.isEmpty() && !n2.isEmpty()) {
            Integer size1 = n1.size();
            Integer size2 = n2.size();
            if(size1 != size2) return false;
            for(int i=0;i<size1;i++) {
                TreeNode a = n1.poll();
                TreeNode b = n2.poll();
                if(a.val != b.val) return false;
                TreeNode left1 = a.left;
                TreeNode right1 = a.right;

                TreeNode left2 = b.left;
                TreeNode right2 = b.right;

                if((left1==null && left2 !=null) || (left1 !=null && left2 ==null)) return false;
                if((right1==null && right2 !=null) || (right1 !=null && right2 == null)) return false;

                if(left1 != null) n1.add(left1);
                if(right1 != null) n1.add(right1);
                if(left2 != null) n2.add(left2);
                if(right2 != null) n2.add(right2);
            }
        }
        return true;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            Integer size = q.size();
            for(int i=0;i<size;i++) {
                TreeNode node = q.poll();
                if(node.val == subRoot.val && subTree(node, subRoot)) return true;
                TreeNode left = node.left;
                TreeNode right = node.right;
                if(left!=null) q.add(left);
                if(right!=null) q.add(right);
            }   
        }
        return false;
    }
}
