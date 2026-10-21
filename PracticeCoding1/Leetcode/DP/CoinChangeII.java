package PracticeCoding1.Leetcode.DP;

public class CoinChangeII {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;
        System.out.println(coinChange(coins, amount,0));
    }

    public static int coinChange(int[] coins, int amount,int i) {
        if(amount == 0) {
            return 1;
        }

        if(i== coins.length){
            return 0;
        }

        int include = 0 , exclude = 0;
        if(coins[i] <= amount){
            include = coinChange(coins, amount - coins[i], i);
        }
        exclude = coinChange(coins, amount, i + 1);
        return include + exclude;
    }

}
