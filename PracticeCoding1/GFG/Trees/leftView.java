import java.util.ArrayList;


public class leftView {
    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode() {
      }

      TreeNode(int var1) {
         this.val = var1;
      }

      TreeNode(int var1, TreeNode var2, TreeNode var3) {
         this.val = var1;
         this.left = var2;
         this.right = var3;
      }
    }

    
    public static void main(String[] args) {
        // code here
      TreeNode var1 = new TreeNode(1);
      var1.left = new TreeNode(2);
      var1.right = new TreeNode(3);
      var1.left.right = new TreeNode(5);
      var1.right.right = new TreeNode(4);
    ArrayList<Integer> result = new ArrayList<>();
    leftsideview(result , var1, 0);
    System.out.println(result);
    }
    public static void leftsideview(ArrayList<Integer> result , TreeNode node , int level){
        if(node ==null){
            return ; 
        }
        if(level == result.size()){
            result.add(node.val);
        }
        leftsideview(result, node.left , level+1);
        leftsideview(result, node.right , level+1);
    }

}

