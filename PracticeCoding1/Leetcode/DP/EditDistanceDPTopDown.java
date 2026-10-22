package PracticeCoding1.Leetcode.DP;
 import java.util.Arrays;

public class EditDistanceDPTopDown {
   

    public static void main(String[] args){
        String s = "FOOD";
        String t = "MONEY";
      int[][] dp = new int[s.length()+1][t.length()+1];
      for(int[] a :dp){
        Arrays.fill(a,-1);
      }
      System.out.println(Min_Ops(s,t,0,0,dp));
    }
    public static int Min_Ops(String s , String t , int i , int j, int[][] dp){
        if(i==s.length()){
            return t.length()-j;
        }
        if(j==t.length()){
            return s.length()-i;

        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
       int ans =0;
       if(s.charAt(i) == t.charAt(j)){
           ans = Min_Ops(s,t,i+1,j+1,dp);//in bottom up aproach dp[i-1][j-1]
       }
       else{
           int insert = 1 + Min_Ops(s,t,i,j+1,dp); //dp[i-1][j]
           int delete = 1 + Min_Ops(s,t,i+1,j,dp); // dp[i-1][j-1]
           int replace = 1 + Min_Ops(s,t,i+1,j+1,dp); // dp[i-1][j-1]
           ans = Math.min(insert,Math.min(delete,replace)); //dp[i][j] = Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
       }
       return dp[i][j] = ans;
    }

}



// 3rd Approach is bottom up approach
//
