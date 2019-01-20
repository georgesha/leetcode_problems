class Solution {
  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int slow = 1, fast = 1;
    int cur = nums[0], count = 1;
    while (fast < nums.length) {
      if (nums[fast] == nums[fast - 1]) {
        count++;
        if (count <= 2) {
          nums[slow] = nums[fast];
          slow++;
        }
      }
      else {
        count = 1;
        nums[slow] = nums[fast];
        slow++;
      }
      fast++;
    }
    return slow;
  }
}
