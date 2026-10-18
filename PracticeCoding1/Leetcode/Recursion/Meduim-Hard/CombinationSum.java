import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = new ArrayList<>();

        combinations(0, 0, target, candidates, ans, new ArrayList<>());

        System.out.println(ans);
    }

    public static void combinations(
        int index,
        int sum,
        int target,
        int[] nums,
        List<List<Integer>> ans,
        List<Integer> current
    ) {

        if (sum == target) {
            ans.add(new ArrayList<>(current));
            return;
        }
        if (sum > target || index == nums.length) {
            return;
        }
        current.add(nums[index]);
        combinations(index, sum + nums[index], target, nums, ans, current);
        current.remove(current.size() - 1);
        combinations(index + 1, sum, target, nums, ans, current);
    }
}