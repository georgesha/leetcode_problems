class Solution {
  public int maxSubArray(int[] nums) {
    int[] dp = new int[nums.length];
    dp[0] = nums[0];
    int max = nums[0];
    for (int i = 1; i < dp.length; i++) {
      dp[i] = nums[i] > dp[i - 1] + nums[i] ? nums[i] : dp[i - 1] + nums[i];
      max = dp[i] > max ? dp[i] : max;
    }
    return max;
  }
}
