class Solution {
    public void flatten(TreeNode root) {
        MakeLL(root);
        
    }
    public TreeNode MakeLL(TreeNode root){
        if(root == null){
            return null;
        }
        if(root.left == null && root.right == null){
            return root;
        }
        TreeNode left_tail = MakeLL(root.left);
        TreeNode right_tail = MakeLL(root.right);
        if(left_tail != null){
            left_tail.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        return right_tail != null ? right_tail : left_tail;

    }
}