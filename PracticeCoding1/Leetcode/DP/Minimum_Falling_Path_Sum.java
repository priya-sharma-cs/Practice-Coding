package PracticeCoding1.Leetcode.DP;

public class Minimum_Falling_Path_Sum {
    public static void main(String[] args) {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        int ans = Integer.MAX_VALUE;
        for(int i =0 ; i< matrix[0].length ; i++){
            ans = Math.min(ans, Minimum_Falling_Path(matrix,0,i));
        }   
        System.out.println(ans);
    }
    public static int Minimum_Falling_Path(int[][] matrix , int cr , int cc){
        if(cc < 0 || cc > matrix[0].length-1){
            return Integer.MAX_VALUE;
        }
        if(cr == matrix.length - 1) {
            return matrix[cr][cc];
        }
        int ld = Minimum_Falling_Path(matrix,cr+1,cc-1);
        int rd = Minimum_Falling_Path(matrix,cr+1,cc+1);
        int d = Minimum_Falling_Path(matrix,cr+1,cc);
        return Math.min(Math.min(ld, rd), d) + matrix[cr][cc];
    }
}
