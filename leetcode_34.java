class Solution {
  public int[] searchRange(int[] nums, int target) {
    // base case
    if (nums == null || nums.length == 0) {
      return new int[]{-1, -1};
    }
    // find appearance of target
    int index = -1, left = 0, right = nums.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        index = mid;
        break;
      }
      else if (nums[mid] < target) {
        left = mid + 1;
      }
      else {
        right = mid - 1;
      }
    }
    if (index == -1) {
      return new int[]{-1, -1};
    }
    int first = index, last = index;
    while (first > 0 && nums[first - 1] == target) {
      first--;
    }
    while(last < nums.length - 1 && nums[last + 1] == target) {
      last++;
    }
    return new int[]{first, last};
  }
}
