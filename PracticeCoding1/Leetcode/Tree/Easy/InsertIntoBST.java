public class InsertIntoBST {
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
		InsertIntoBST obj = new InsertIntoBST();
		TreeNode root = obj.new TreeNode(4);
		root.left = obj.new TreeNode(2);
		root.right = obj.new TreeNode(7);
		root.left.left = obj.new TreeNode(1);
		root.left.right = obj.new TreeNode(3);

		int val = 5;
		TreeNode newRoot = obj.insertIntoBST(root, val);
		System.out.println("New root after insertion: " + newRoot.val);
	}
	public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        if(root.val < val){
            root.right = insertIntoBST(root.right ,val);
        }
        else{
            root.left = insertIntoBST(root.left,val);
        }
        return root;
        
    }
}