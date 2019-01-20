class Solution {
  public void sortColors(int[] nums) {
    if (nums.length == 0) {
      return;
    }
    int slow = 0, fast = 0;
    for (int i = 0; i <= 2; i++) {
      while (slow < nums.length && fast < nums.length) {
        if (slow > fast) {
          fast = slow;
        }
        if (nums[fast] == i) {
          int tmp = nums[slow];
          nums[slow] = nums[fast];
          nums[fast] = tmp;
          slow++;
        }
        fast++;
      }
      fast = slow;
    }
  }
}
