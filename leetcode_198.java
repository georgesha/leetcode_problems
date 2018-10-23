class Solution {
  public int rob(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int[] total = new int[nums.length + 1];
    total[0] = 0;
    total[1] = nums[0];
    for(int i = 1; i < nums.length; i++) {
      total[i + 1] = Math.max(total[i], total[i - 1] + nums[i]);
    }
    return total[nums.length];
  }
}
