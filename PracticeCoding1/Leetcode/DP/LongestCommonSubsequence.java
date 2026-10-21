package PracticeCoding1.Leetcode.DP;

import java.util.*;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1="ace";
        String s2="abcde";
        System.out.println(LCS(s1,s2,0,0));
    } 
    

 public static int LCS(String s1, String s2, int i  , int j) {

    int ans=0;
    if(i==s1.length() || j==s2.length()){
        return 0;
       
    }
    if(s1.charAt(i)==s2.charAt(j)){
        ans=1+LCS(s1,s2,i+1,j+1);
    }
    else{
        int ans1=LCS(s1,s2,i+1,j);
        int ans2=LCS(s1,s2,i,j+1);
        ans=Math.max(ans1,ans2);
    }
    return ans;
}

}
