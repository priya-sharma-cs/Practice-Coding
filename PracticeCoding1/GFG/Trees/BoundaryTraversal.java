import java.util.ArrayList;



public class BoundaryTraversal {
     public class TreeNode {

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

    public static void main(String[] args) {
        BoundaryTraversal obj = new BoundaryTraversal();
        TreeNode root = obj.new TreeNode(1);
        root.left = obj.new TreeNode(2);
        root.right = obj.new TreeNode(3);
        root.left.left = obj.new TreeNode(4);
        root.left.right = obj.new TreeNode(5);
        root.right.left = obj.new TreeNode(6);
        root.right.right = obj.new TreeNode(7);
        ArrayList<Integer> result = obj.boundaryTraversal(root);
        System.out.println("Boundary Traversal: " + result);
    }

    ArrayList<Integer> ans = new ArrayList<>();

    public void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            ans.add(root.val);
            return;
        }

        inorder(root.left);
        inorder(root.right);
    }


    public void leftnode(TreeNode root) {

        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            return;
        }

        ans.add(root.val);

        if (root.left != null) {
            leftnode(root.left);
        } else {
            leftnode(root.right);
        }
    }


    public void rightnode(TreeNode root) {

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

        ans.add(root.val);
    }


    public ArrayList<Integer> boundaryTraversal(TreeNode root) {

        if (root == null) {
            return ans;
        }

        // Root
        if (root.left != null || root.right != null) {
            ans.add(root.val);
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