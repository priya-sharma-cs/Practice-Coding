import java.util.*;


public class TopViewOfBT{

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
                Pair rp = q.poll();
                if(!map.containsKey(rp.vt)){
                    map.put(rp.vt , rp.node.val);
                }
                if(rp.node.left != null){
                    q.add(new Pair(rp.node.left , rp.vt - 1));
                }
                if(rp.node.right != null){
                    q.add(new Pair(rp.node.right , rp.vt + 1));
                }
               
            }
            List<Integer> ll = new ArrayList<>();
            for(int key : map.keySet()){
                ll.add(map.get(key));
            }
            return ll;
            // return new ArrayList<>(map.values());  OR in place of above 4 lines we can use this line to return the values of map in list

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