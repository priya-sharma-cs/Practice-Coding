import java.util.Arrays;

public class MCM {
public static void main(String[] args) {
int[] arr = {4, 2, 3, 5, 1};
int n = arr.length;

    int[][] dp = new int[n][n];

    for (int[] row : dp) {
        Arrays.fill(row, -1);
    }

    System.out.println(mcm(arr, 0, n - 1, dp));
}

public static int mcm(int[] arr, int i, int j, int[][] dp) {
    if (i + 1 == j) {
        return 0;
    }

    if (dp[i][j] != -1) {
        return dp[i][j];
    }

    int ans = Integer.MAX_VALUE;

    for (int k = i + 1; k < j; k++) {
        int fs = mcm(arr, i, k, dp);
        int ss = mcm(arr, k, j, dp);

        int res = arr[i] * arr[k] * arr[j];

        ans = Math.min(ans, fs + ss + res);
    }

    dp[i][j] = ans;
    return ans;
}


}




// normal using recursion

//  public static int mcm(int[] arr, int i , int j){
//         if(i+1==j){
//             return 0;
//         }
//         int ans = Integer.MAX_VALUE;
//         for(int k = i+1 ; k<j ; k++){
//             int fs = mcm(arr,i,k);
//             int  ss = mcm(arr,k,j);
//             int res = arr[i]*arr[k]*arr[j];
//             ans = Math.min(ans , fs+ss+res);
//         }
//         return ans;


//     }
