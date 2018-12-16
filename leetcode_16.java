class Solution {
  public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int closest = nums[0] + nums[1] + nums[2];
    for (int i = 0; i < nums.length; i++) {
      if (i + 2 > nums.length - 1) {
        break;
      }
      int left = i + 1, right = nums.length - 1;
      while (left < right) {
        int cur = nums[i] + nums[left] + nums[right];
        if (Math.abs(cur - target) < Math.abs(closest - target)) {
          closest = cur;
        }
        if (cur > target) {
          right--;
        }
        else {
          left++;
        }
      }
    }
    return closest;
  }
}
