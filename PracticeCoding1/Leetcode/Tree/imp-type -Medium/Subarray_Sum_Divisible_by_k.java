import java.util.HashMap;

public class Subarray_Sum_Divisible_by_k {
   public static void main(String[] args){
    int[]  nums = {4,5,0,-2,-3,1};
    int k = 5;
    System.out.println(subarraysDivByK(nums , k));
   }
   public static int subarraysDivByK(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0 , 1); // to handle the case when the prefix sum itself is divisible by k
    int sum = 0;
    for(int i = 0 ; i < nums.length ; i++){
        sum = (sum + nums[i]) % k; // sum is the prefix sum of the array
        if(sum < 0){
            sum += k;
        }   
        if(map.containsKey(sum)){
            map.put(sum , map.get(sum) + 1);
        }
        else{
            map.put(sum , 1);
        }
    }
        int ans = 0;
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq >1){
                ans += (freq * (freq - 1)) / 2;
            }
        }
        return ans;
}
}