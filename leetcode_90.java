class Solution {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if (nums == null || nums.length == 0) {
      return result;
    }
    Arrays.sort(nums);
    List<Integer> cur = new ArrayList<Integer>();
    subset(result, nums, cur, 0);
    return result;
  }
  private void subset(List<List<Integer>> result, int[] nums, List<Integer> cur, int index) {
    if (index <= nums.length) {
      result.add(new ArrayList<Integer>(cur));
    }
    for (int i = index; i < nums.length; i++) {
      if (i > index && nums[i] == nums[i - 1]) {
        continue;
      }
      cur.add(nums[i]);
      subset(result, nums, cur, i + 1);
      cur.remove(cur.size() - 1);
    }
  }
}
