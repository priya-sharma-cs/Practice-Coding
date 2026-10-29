import java.util.*;

public class super_egg_drop {


    public static void main(String [] args){
        int k = 1 , n=2;
        int[][] dp = new int[n+1][k+1];
        for(int[] a :dp){
            Arrays.fill(a,-1);
        }
        System.out.println(eggdrop1(n,k, dp));
    }

    // 3rd approach dp+ binary search 

    public static int eggdrop1(int n , int e, int[][] dp){
        if(n==0 || n==1 ||e==1){
            return n ; 
        }
        if(dp[n][e]!=-1){
                return dp[n][e];
        }
        int ans = Integer.MAX_VALUE;
        int lo=1;
        int hi =n;
        while(lo <=hi){
            int f = (lo +hi)/2;
            int b = eggdrop1(f-1, e-1,dp);
            int ub = eggdrop1(n-f,e,dp);
            int t = Math.max(b,ub)+1;
            ans = Math.min(ans,t);
            if(b <ub){
                lo =f+1;
            }
            else{
                hi = f-1;
            }

        }
        return dp[n][e] =ans;
    }

}

// solution using dp 2nd approach 

//      public static int eggdrop(int n , int e, int[][] dp){
//         if(n==0 || n==1 ||e==1){
//             return n ; 
//         }
//         if(dp[n][e]!=-1){
//                 return dp[n][e];
//         }
//         int ans = Integer.MAX_VALUE;
//         for(int f =1; f<=n ; f++){
//             int b = eggdrop(f-1, e-1,dp);
//             int ub = eggdrop(n-f,e,dp);
//             int t = Math.max(b,ub)+1;
//             ans = Math.min(ans,t);

//         }
//         return dp[n][e]=ans;
//     }
// }











// recursion solution chalega nhi stack ovrlow k karan 1st approach 
// public class super_egg_drop {

//     public static void main(String [] args){
//         int k = 1 , n=2;
//     }
//     public static int eggdrop(int n , int e){
//         if(n==0 || n==1 ||e==1){
//             return n ; 
//         }
//         int ans = Integer.MAX_VALUE;
//         for(int f =0; f<=n ; f++){
//             int b = eggdrop(f-1, e-1);
//             int ub = eggdrop(n-f,e);
//             int t = Math.max(b,ub)+1;
//             ans = Math.min(ans,t);

//         }
//         return ans;
//     }
// }