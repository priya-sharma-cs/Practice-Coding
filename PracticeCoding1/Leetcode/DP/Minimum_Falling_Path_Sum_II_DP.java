package PracticeCoding1.Leetcode.DP;
import java.util.Arrays;
public class Minimum_Falling_Path_Sum_II_DP {

   
    public static void main(String[] args) {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        int [][] dp = new int[matrix.length][matrix[0].length];
        for(int [ ] a:dp){
            Arrays.fill(a,-1000000);
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0; i< matrix[0].length ; i++){
            ans = Math.min(ans, Minimum_Falling_Path_II(matrix,0,i,dp));
        }
        System.out.println(ans);

        
    }

  
    public static int Minimum_Falling_Path_II(int[][] matrix , int cr , int cc, int [][] dp){
        if(cr == matrix.length-1) {
            return matrix[cr][cc];
        }
        if(dp[cr][cc] != -1000000) {
            return dp[cr][cc];
        }
        int ans = Integer.MAX_VALUE;
        for(int col=0;col< matrix[0].length ; col++){
            if(col!=cc){
                ans = Math.min(ans, Minimum_Falling_Path_II(matrix,cr+1,col,dp));
            }
        }
        dp[cr][cc] = ans + matrix[cr][cc];
        return dp[cr][cc];
    }




    
}
