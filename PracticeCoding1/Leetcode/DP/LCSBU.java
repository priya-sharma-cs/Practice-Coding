package PracticeCoding1.Leetcode.DP;

import java.util.Arrays;

public class LCSBU {
     public static void main(String[] args) {
        String s1="ace";
        String s2="abcde";
        int[][] dp=new int[s1.length()][s2.length()];
        for(int [] a :dp){
            Arrays.fill(a,-1);
        }
        System.out.println(NLCS(s1,s2,0,0,dp));
    } 

    public static int NLCSBU(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if(s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    int F1= dp[i - 1][j];
                    int F2= dp[i][j - 1];
                    dp[i][j] = Math.max(F1, F2);
                }
            }
        }

        return dp[m-1][n-1];
    }

    

 public static int NLCS(String s1, String s2, int i  , int j, int[][] dp) {

    if(i==s1.length() || j==s2.length()){
        return 0;
       
    }
    if(dp[i][j]!=-1){
        return dp[i][j];
    }
    int ans=0 ;
    if(s1.charAt(i)==s2.charAt(j)){
        ans=1+NLCS(s1,s2,i+1,j+1, dp);
    }
    else{
        int f1=NLCS(s1,s2,i+1,j, dp);
        int f2=NLCS(s1,s2,i,j+1, dp);
        ans=Math.max(f1,f2);
    }
    dp[i][j]=ans;
    return ans;
}


    
}
