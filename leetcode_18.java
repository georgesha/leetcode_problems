class Solution {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if (nums.length < 4) {
      return result;
    }
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 3; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      for (int j = i + 1; j < nums.length - 2; j++) {
        if (j > i && nums[j] == nums[j - 1]) {
          continue;
        }
        int first = nums[i], second = nums[j];
        int left = j + 1, right = nums.length - 1;
        while (left < right) {
          int sum = first + second + nums[left] + nums[right];
          if (sum == target) {
            ArrayList<Integer> cur = new ArrayList<Integer>();
            cur.add(first);
            cur.add(second);
            cur.add(nums[left]);
            cur.add(nums[right]);
            result.add(cur);
            while (left < right && nums[left] == nums[left + 1]) {
              left++;
            }
            while (right < right && nums[right] == nums[right - 1]) {
              right--;
            }
            left++;
            right--;
          }
          else if (sum > target) {
            right--;
          }
          else {
            left++;
          }
        }
      }
    }
    return result;
  }
}
