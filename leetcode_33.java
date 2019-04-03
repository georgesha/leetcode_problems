class Solution {
  public int search(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
      return -1;
    }
    int n = nums.length;
    int left = 0, right = n - 1;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] > nums[right]) {
        left = mid + 1;
      }
      else {
        right = mid;
      }
    }
    int smallest = left;
    left = 0;
    right = n - 1;
    if (target >= nums[smallest] && target <= nums[right]) {
      left = smallest;
    }
    else {
      right = smallest - 1;
    }
    while(left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        return mid;
      }
      else if (nums[mid] < target) {
        left = mid + 1;
      }
      else {
        right = mid - 1;
      }
    }
    return -1;
  }
}
