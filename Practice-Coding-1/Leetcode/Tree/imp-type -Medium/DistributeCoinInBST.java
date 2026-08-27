class Solution {
    int count =0;
    public int distributeCoins(TreeNode root) {
        distribute(root);
        return count;
        
    }
    public int distribute(TreeNode root) {
        if (root==null){
            return 0;
        }
        int lp = distribute(root.left);
        int rp = distribute(root.right);
        count = count + Math.abs(lp)+Math.abs(rp);
        return lp +rp +root.val -1;
        
    }

   
}
