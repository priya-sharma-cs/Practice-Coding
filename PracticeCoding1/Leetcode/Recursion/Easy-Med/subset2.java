import java.util.*;
public class subset2 {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> ans = new ArrayList<>();
        ans = subsetsWithDup(nums); 
        System.out.println(ans);

        
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), ans);

        return ans;
    }

    static void backtrack(int index, int[] nums,
                          List<Integer> current,
                          List<List<Integer>> ans) {

        // Current subset ko answer mein add karo
        ans.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {

            // Duplicate ko skip karo
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            // Include
            current.add(nums[i]);

            // Recursion
            backtrack(i + 1, nums, current, ans);

            // Backtrack
            
            current.remove(current.size() - 1);
        }
    }
}
