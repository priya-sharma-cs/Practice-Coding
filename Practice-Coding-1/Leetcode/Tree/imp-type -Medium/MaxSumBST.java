class Solution {
    public int maxSumBST(TreeNode root) {
        BstPair result = ValidBST(root);
        return result.ans;
    }

    public BstPair ValidBST(TreeNode root) {
        if (root == null) {
            return new BstPair();
        }

        BstPair lbp = ValidBST(root.left);
        BstPair rbp = ValidBST(root.right);

        BstPair sbp = new BstPair();

        sbp.min = Math.min(lbp.min, Math.min(rbp.min, root.val));
        sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));

        sbp.sum = lbp.sum + rbp.sum + root.val;

        if (lbp.isbst && rbp.isbst &&
            lbp.max < root.val &&
            rbp.min > root.val) {

            sbp.isbst = true;
            sbp.ans = Math.max(
                sbp.sum,
                Math.max(lbp.ans, rbp.ans)
            );

        } else {
            sbp.isbst = false;
            sbp.ans = Math.max(lbp.ans, rbp.ans);
        }

        return sbp;
    }

    class BstPair {
        boolean isbst = true;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        int sum = 0;
        int ans = 0;
    }
}