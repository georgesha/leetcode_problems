class Solution {
  public int minSubArrayLen(int s, int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int i = 0, j = 0, sum = 0, min=Integer.MAX_VALUE;
    while (i < nums.length) {
      sum += nums[i];
      i++;
      while (sum > s) {
        sum -= nums[j];
        min = Math.min(min, i - j);
        j++;
      }
    }
    if (min == Integer.MAX_VALUE) {
      return 0;
    }
    else {
      return min;
    }
  }
}
