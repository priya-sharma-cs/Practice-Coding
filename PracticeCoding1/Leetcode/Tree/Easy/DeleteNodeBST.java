

public class DeleteNodeBST {
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
        DeleteNodeBST obj = new DeleteNodeBST();
        TreeNode root = obj.new TreeNode(5);
        root.left = obj.new TreeNode(3);
        root.right = obj.new TreeNode(6);
        root.left.left = obj.new TreeNode(2);
        root.left.right = obj.new TreeNode(4);
        root.right.right = obj.new TreeNode(7);

        int key = 3;
        TreeNode newRoot = obj.deleteNode(root, key);
        System.out.println("New root after deletion: " + newRoot.val);
     }
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root==null){
             return null;
        }
        if(root.val < key){
            root.right= deleteNode(root.right,key);

        }
        else if(root.val > key){
            root.left = deleteNode(root.left,key);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{
                int max = max(root.left);
                root.left=deleteNode(root.left,max);
                root.val = max;
            }
        }
        return root;
        
    }
    public int max(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int rmax = max(root.right);
        return Math.max(rmax,root.val);

    }
}