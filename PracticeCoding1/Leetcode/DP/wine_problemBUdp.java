// package PracticeCoding1.Leetcode.DP;

public class wine_problemBUdp {
    public static void main(String[] args){
        int[] wines = {2, 3, 5, 1, 4};
    
        System.out.println(maximum_profit(wines ));
    }
    public static int maximum_profit(int[] wine){
        int n = wine.length;
        int[][] dp = new int[n][n];
        int year = n ;
        for(int i =0 ;i<dp.length ; i++){
            dp[i][i]= wine[i]*year;

        }
       
        for(int gap = 1 ; gap<dp.length ; gap++){
            year = n-gap;
            for(int  j = gap ; j<dp.length ; j++){
                int i = j-gap;
                int f = wine[i]*year + dp[i+1][j];
                int l = wine[j]*year +dp[i][j-1];
                dp[i][j] = Math.max(f,l);
            }
        }
        return dp[0][dp.length-1];

    }
   
}
