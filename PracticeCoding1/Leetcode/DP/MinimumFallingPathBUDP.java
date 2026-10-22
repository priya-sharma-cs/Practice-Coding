package PracticeCoding1.Leetcode.DP;
import java.util.Arrays;
public class MinimumFallingPathBUDP {
   
    public static void main(String[] args) {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        int [][] dp = new int[matrix.length][matrix[0].length];
        for(int [ ] a:dp){
            Arrays.fill(a,-100000);
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0; i< matrix[0].length ; i++){
            ans = Math.min(ans, Minimum_Falling_Path(matrix,0,i,dp));
        }
        System.out.println(ans);
    }
    public static int Minimum_Falling_Path(int[][] matrix , int cr , int cc, int [][] dp){
        if(cc < 0 || cc > matrix[0].length-1){
            return Integer.MAX_VALUE;
        }
        if(cr == matrix.length - 1) {
            return matrix[cr][cc];
        }
        if(dp[cr][cc] != -100000) {
            return dp[cr][cc];
        }
        int ld = Minimum_Falling_Path(matrix,cr+1,cc-1,dp);
        int rd = Minimum_Falling_Path(matrix,cr+1,cc+1,dp);
        int d = Minimum_Falling_Path(matrix,cr+1,cc,dp);
        dp[cr][cc] = Math.min(Math.min(ld, rd), d) + matrix[cr][cc];
        return dp[cr][cc];
    }

}
