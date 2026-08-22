class Solution {

    ArrayList<Integer> ans = new ArrayList<>();

    public void inorder(Node root) {

        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            ans.add(root.data);
            return;
        }

        inorder(root.left);
        inorder(root.right);
    }


    public void leftnode(Node root) {

        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            return;
        }

        ans.add(root.data);

        if (root.left != null) {
            leftnode(root.left);
        } else {
            leftnode(root.right);
        }
    }


    public void rightnode(Node root) {

        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            return;
        }

        if (root.right != null) {
            rightnode(root.right);
        } else {
            rightnode(root.left);
        }

        ans.add(root.data);
    }


    public ArrayList<Integer> boundaryTraversal(Node root) {

        if (root == null) {
            return ans;
        }

        // Root
        if (root.left != null || root.right != null) {
            ans.add(root.data);
        }

        // Left Boundary
        leftnode(root.left);

        // Leaf Nodes
        inorder(root);

        // Right Boundary
        rightnode(root.right);

        return ans;
    }
}