class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if (nums == null || nums.length < 3) {
      return result;
    }
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      int left = i + 1, right = nums.length - 1;
      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];
        if (sum == 0) {
          ArrayList<Integer> cur = new ArrayList<Integer>();
          cur.add(nums[i]);
          cur.add(nums[left]);
          cur.add(nums[right]);
          result.add(cur);
          while (left < right && nums[left] == nums[left + 1]) {
            left++;
          }
          while (left < right && nums[right] == nums[right - 1]) {
            right--;
          }
          left++;
          right--;
        }
        else if (sum > 0) {
          right--;
        }
        else {
          left++;
        }
      }
    }
    return result;
  }
}
