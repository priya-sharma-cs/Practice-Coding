package PracticeCoding1.Leetcode.DP;

import java.util.Arrays;

public class LIS {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(LengthofLIS(nums));
    }
    public static int LengthofLIS(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp , 1);
        for(int i =1 ; i< dp.length ; i++){
            for(int j=i-1 ; j>=0 ; j--){
                if(nums[i] > nums[j]){
                    int x = dp[j];
                    dp[i] = Math.max(dp[i] , 1 + x);
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
    
}



