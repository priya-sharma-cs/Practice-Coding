package PracticeCoding1.Leetcode.DP;


// wine problem
//Given n wines in a row, with integers denoting the cost of each wine respectively. Each year you can sale the first or the last wine in a row. However, the price of wines increases over time. Let the initial profits from the wines be P1, P2, P3...Pn. In the Yth year, the profit from the ith wine will be Y*Pi. For each year, your task is to print "beg" or "end" denoting whether first or last wine should be sold. Also, calculate the maximum profit from all the wines.


public class Wine_Problem {
    public static void main(String[] args){
        int[] wines = {2, 3, 5, 1, 4};
        int n = wines.length;
        System.out.println(maximum_profit(wines , 0 , n-1 , 1));
    }
    public static int maximum_profit(int[] wines  , int i , int j , int year){
        if(i > j) return 0;
        int f = wines[i] * year + maximum_profit(wines , i+1 , j , year+1);
        int l = wines[j] * year + maximum_profit(wines , i , j-1 , year+1);
        return Math.max(f , l);
    }
    
}
