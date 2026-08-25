class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        subsequences(nums,0,arr,ans);
        return ans;
    }
    public static void subsequences(int[] nums , int index , List<Integer> current,List<List<Integer> > ans ){
        if(index==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        // take 
        current.add(nums[index]);
        subsequences(nums,index+1,current,ans);
        // not take that element
        // NOTE-the element is removed is the same element which is added in the previous step so we can remove it from the current list
        current.remove(current.size()-1);
        subsequences(nums,index+1,current,ans);
    }
}