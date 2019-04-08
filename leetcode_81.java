class Solution {
  public boolean search(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
      return false;
    }
    int left = 0, right = nums.length;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        return true;
      }
      else if (nums[mid] > nums[left]) {
        if (nums[left] < target && nums[mid] > target) {
          right = mid;
        }
        else {
          left = mid + 1;
        }
      }
      else if (nums[mid] < nums[right]) {
        if (nums[mid] < target && nums[right] > target) {
          left = mid;
        }
        else {
          right = mid;
        }
      }
      else {
        left++;
      }
    }
    return false;
  }
}
