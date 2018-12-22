class Solution {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if (nums.length == 0) {
      return result;
    }
    List<Integer> cur = new ArrayList<Integer>();
    helper(result, cur, nums, 0);
    return result;
  }
  private void helper(List<List<Integer>> result, List<Integer> cur, int[] nums, int index) {
    if (index == nums.length) {
      result.add(cur);
      return;
    }
    helper(result, new ArrayList<Integer>(cur), nums, index + 1);
    cur.add(nums[index]);
    helper(result, new ArrayList<Integer>(cur), nums, index + 1);
  }
}
