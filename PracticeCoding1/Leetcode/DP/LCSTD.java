package PracticeCoding1.Leetcode.DP;
import java.util.*;

public class LCSTD {
     public static void main(String[] args) {
        String s1="ace";
        String s2="abcde";
        int[][] dp=new int[s1.length()][s2.length()];
        for(int [] a :dp){
            Arrays.fill(a,-1);
        }
        System.out.println(NLCS(s1,s2,0,0,dp));
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
