class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root,
                                         TreeNode p,
                                         TreeNode q) {

        // Base case
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // Both sides found one node
        if (left != null && right != null) {
            return root;
        }

        // Return whichever side found something
        return left != null ? left : right;
    }
}