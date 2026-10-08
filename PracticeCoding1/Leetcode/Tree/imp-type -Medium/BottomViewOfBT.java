import java.util.*;

public class   BottomViewOfBT{

    

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

	class Solution {
		public List<Integer> TopView(TreeNode root) {
            Queue<Pair> q = new LinkedList<>();
            TreeMap<Integer , Integer> map = new TreeMap<>();
            q.add(new Pair(root , 0));
            while(!q.isEmpty()){
                Pair rp = q.poll(); // rp is the removed pair from queue
                map.put(rp.vt , rp.node.val); // we are putting the value of node in map with key as vertical level
                if(rp.node.left != null){
                    q.add(new Pair(rp.node.left , rp.vt - 1));
                }
                if(rp.node.right != null){
                    q.add(new Pair(rp.node.right , rp.vt + 1));
                }
               
            }
			return new ArrayList<>(map.values());
		}
	}
    class Pair{
        TreeNode node;
        int vt;
        public Pair(TreeNode node , int vt){
            this.node = node;
            this.vt = vt;
        }
    }

}