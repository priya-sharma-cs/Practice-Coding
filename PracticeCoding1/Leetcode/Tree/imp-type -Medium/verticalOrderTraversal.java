import java.util.*;

public class verticalOrderTraversal {

git 
public static void main(String[] args) {

    verticalOrderTraversal obj = new verticalOrderTraversal();

    TreeNode root = obj.new TreeNode(1);
    root.left = obj.new TreeNode(2);
    root.right = obj.new TreeNode(3);
    root.left.left = obj.new TreeNode(4);
    root.left.right = obj.new TreeNode(5);
    root.right.left = obj.new TreeNode(6);
    root.right.right = obj.new TreeNode(7);

    List<List<Integer>> ans = obj.vertical(root);

    System.out.println(ans);
}

class TreeNode {
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

public List<List<Integer>> vertical(TreeNode root) {

    List<List<Integer>> ans = new ArrayList<>();

    if (root == null) {
        return ans;
    }

    Queue<Pair> q = new LinkedList<>();

    TreeMap<Integer, List<Integer>> map = new TreeMap<>();

    q.add(new Pair(root, 0));

    while (!q.isEmpty()) {

        Pair rp = q.poll();

        if (!map.containsKey(rp.col)) {
            map.put(rp.col, new ArrayList<>());
        }

        map.get(rp.col).add(rp.node.val);

        if (rp.node.left != null) {
            q.add(new Pair(rp.node.left, rp.col - 1));
        }

        if (rp.node.right != null) {
            q.add(new Pair(rp.node.right, rp.col + 1));
        }
    }

    for (List<Integer> list : map.values()) {
        ans.add(list);
    }

    return ans;
}

class Pair {
    TreeNode node;
    int col;

    Pair(TreeNode node, int col) {
        this.node = node;
        this.col = col;
    }
}


}
