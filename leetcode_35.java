class Solution {
  public int searchInsert(int[] nums, int target) {
    // corner case
    if (nums.length == 0) {
      return 0;
    }

    int i = 0;
    while (i < nums.length) {
      if (nums[i] >= target) {
        if (i == 0) {
          return 0;
        }
        return i;
      }
      i++;
    }
    return i;
  }
}
