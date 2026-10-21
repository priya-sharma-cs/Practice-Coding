package PracticeCoding1.Leetcode.DP;
import java.util.Arrays;

public class CoinChnagedIIDPTD {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;
        int[][] dp = new int[coins.length][amount +1];
        for(int [] a : dp){
            Arrays.fill(a, -1);
        }
        System.out.println(coinChange(coins, amount, 0, dp));
    }

    public static int coinChange(int[] coins, int amount , int i ,  int [][] dp) {
       
        if(amount == 0) {
            return 1;
        }
        if(i== coins.length){
            return 0;
        }
        if(dp[i][amount] != -1 ){
            return dp[i][amount];
        }

        int include = 0 , exclude = 0;
        if(coins[i] <= amount){
            include = coinChange(coins, amount - coins[i], i, dp);
        }
        exclude = coinChange(coins, amount, i + 1, dp);
        return dp[i][amount] = include + exclude;




    }

}
