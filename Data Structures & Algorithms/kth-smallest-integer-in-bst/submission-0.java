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
    public int kthSmallest(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        List<Integer> list = new ArrayList<>();

        while(!q.isEmpty()) {
            Integer size = q.size();
            for (int i=0;i<size;i++) {
                TreeNode node = q.poll();
                list.add(node.val);

                TreeNode left = node.left;
                TreeNode right = node.right;

                if(left!=null) q.add(left);
                if(right!=null) q.add(right);
            }
        }

        Collections.sort(list);
        return list.get(k-1);


    }
}
