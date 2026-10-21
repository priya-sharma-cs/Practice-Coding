package PracticeCoding1.Leetcode.DP;


public class CoinCBU {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;
        System.out.println(coinChangeBU(coins, amount));
    }

    public static int coinChangeBU(int[] coins, int amount ){
        int[][] dp = new int[coins.length + 1][amount + 1];
        for(int i = 0; i <dp.length; i++){
            dp[i][0] = 1;
        }
        for(int i =1 ; i< dp.length ; i++){ //coins
            for (int am = 1 ; am < dp[0].length; am++) { //amount
                int include = 0 , exclude = 0;
                if(coins[i-1] <= am){
                    include = dp[i][am - coins[i-1]];
                }
                exclude = dp[i-1][am];
                dp[i][am] = include + exclude;
            }

        }
        return dp[coins.length][amount];
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
