class Solution {
    int c = 0;
    public int minCameraCover(TreeNode root) {
        int x = minCamera(root);
        return x == -1 ? c +1 : c;
        
    }
    public int minCamera(TreeNode root){
        if(root == null){
            return 0;
        }
        int left  = minCamera(root.left);
        int right  = minCamera(root.right);
        if(left == -1 || right == -1){
            c++;
            return 1;//has a camera 
        }
        else if(left == 1 || right == 1){
            return 0;//Already  cover 
        }else{
            return -1;// need a camera
        }

    }
}