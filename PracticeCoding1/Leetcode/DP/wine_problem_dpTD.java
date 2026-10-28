package PracticeCoding1.Leetcode.DP;

public class wine_problem_dpTD {
    public static void main(String[] args){
        int[] wines = {2, 3, 5, 1, 4};
        int n = wines.length;
        int[][] dp = new int[n][n];
        System.out.println(maximum_profit(dp , wines , 0 , n-1 , 1));
    }
    public static int maximum_profit(int[][] dp , int[] wines  , int i , int j , int year){
        if(i > j) return 0;
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        
        int f = wines[i] * year + maximum_profit(dp,wines , i+1 , j , year+1);
        int l = wines[j] * year + maximum_profit(dp,wines , i , j-1 , year+1);
        return dp[i][j] = Math.max(f,l);
    }
}
