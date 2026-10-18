
import java.util.*;

public class Subsets {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        List<List<Integer>> ans = new ArrayList<>();

        subsequences(nums, 0, new ArrayList<>(), ans);

        System.out.println(ans);
    }

    public static void subsequences(
            int[] nums,
            int index,
            List<Integer> current,
            List<List<Integer>> ans) {

        if (index == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Take the element
        current.add(nums[index]);

        subsequences(nums, index + 1, current, ans);

        // Backtrack: remove the element
        current.remove(current.size() - 1);

        // Do not take the element
        subsequences(nums, index + 1, current, ans);
    }
}

