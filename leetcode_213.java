class Solution {
  public int rob(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    if (nums.length < 2) {
      return nums[0];
    }
    int[] totalFromFirst = new int[nums.length + 1];
    int[] totalFromSecond = new int[nums.length + 1];
    totalFromFirst[0] = 0;
    totalFromFirst[1] = nums[0];
    totalFromSecond[0] = 0;
    totalFromSecond[1] = 0;
    for(int i = 1; i < nums.length; i++) {
      totalFromFirst[i + 1] = Math.max(totalFromFirst[i], totalFromFirst[i - 1] + nums[i]);
      totalFromSecond[i + 1] = Math.max(totalFromSecond[i], totalFromSecond[i - 1] + nums[i]);
    }
    return Math.max(totalFromFirst[nums.length - 1], totalFromSecond[nums.length]);
  }
}
