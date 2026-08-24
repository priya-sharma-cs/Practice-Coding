class Solution {

    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;

        return binsearch(l, r, nums, target);
    }

    public int binsearch(int l, int r, int[] nums, int target) {

        // Base case
        if (l > r) {
            return -1;
        }

        int mid = l + (r - l) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        else if (nums[mid] > target) {
            return binsearch(l, mid - 1, nums, target);
        }

        else {
            return binsearch(mid + 1, r, nums, target);
        }
    }
}