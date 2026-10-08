

public class DistributeCoinInBST {

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static int count = 0;

    public static int distributeCoins(TreeNode root) {

        distribute(root);

        return count;
    }

    public static int distribute(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int lp = distribute(root.left);
        int rp = distribute(root.right);

        count = count + Math.abs(lp) + Math.abs(rp);

        return lp + rp + root.val - 1;
    }

    public static void main(String[] args) {

        /*
                3
               /
              0
               \
                0

        */

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(0);
        root.left.right = new TreeNode(0);

        System.out.println("Minimum moves = " + distributeCoins(root));
    }
}