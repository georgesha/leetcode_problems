class Solution {
  public boolean canJump(int[] nums) {
    if (nums.length <= 1) {
      return true;
    }
    else if (nums[0] == 0) {
      return false;
    }
    int[] result = new int[nums.length];
    Arrays.fill(result, 0);
    result[0] = 1;
    for (int i = 0; i < result.length; i++) {
      if (result[i] == 1) {
        int steps = nums[i], j = i + 1;
        while (steps > 0 && j < result.length) {
          result[j] = 1;
          steps--;
          j++;
        }
      }
    }
    return result[result.length - 1] == 1;
  }
}
