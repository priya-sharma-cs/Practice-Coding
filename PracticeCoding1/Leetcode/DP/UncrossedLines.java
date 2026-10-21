package PracticeCoding1.Leetcode.DP;



public class UncrossedLines {
    public static void main(String[] args) {
        int[] nums1 = {1,4,2};
        int[] nums2 = {1,2,4};
        System.out.println(NLCSBU(nums1, nums2));
    }
    public static int NLCSBU(int[] s1, int[] s2) {
        int m = s1.length;
        int n = s2.length;
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i< m; i++) {
            for (int j = 1; j <n; j++) {
                if(s1[i-1] == s2[j-1]) {
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

    

 public static int NLCS(int[] s1, int[] s2, int i  , int j, int[][] dp) {

    if(i==s1.length || j==s2.length){
        return 0;
       
    }
    if(dp[i][j]!=-1){
        return dp[i][j];
    }
    int ans=0 ;
    if(s1[i]==s2[j]){
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
