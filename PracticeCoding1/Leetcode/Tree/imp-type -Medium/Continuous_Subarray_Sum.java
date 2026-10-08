import java.util.HashMap;

public class Continuous_Subarray_Sum {
    public static void main(String[] args){
        int[] nums = {23,2,4,6,7};
        int k = 6;
        System.out.println(checkSubarraySum(nums , k));
    }
    public static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0 , -1); // to handle the case when the prefix sum itself is divisible by k
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum = (sum + nums[i]) % k; // sum is the prefix sum of the array
            if(map.containsKey(sum)){
                if(i - map.get(sum) > 1){
                    return true;
                }
            }
            else{
                map.put(sum , i);
            }
        }
        return false;
    }
}