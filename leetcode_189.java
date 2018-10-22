class Solution {
  public void rotate(int[] nums, int k) {
    if(nums.length == 0 || k <= 0) {
      return;
    }
    if(k > nums.length) {
      k = k % nums.length;
    }
    int[] result = new int[nums.length];
    for(int i = 0; i < k; i++) {
      result[i] = nums[nums.length - (k - i)];
    }
    for(int i = k; i < result.length; i++) {
      result[i] = nums[i - k];
    }
    for(int i = 0; i < nums.length; i++) {
      nums[i] = result[i];
    }
  }
}
