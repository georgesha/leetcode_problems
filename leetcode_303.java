class NumArray {
  int[] nums;
  int[] sums;
  public NumArray(int[] nums) {
    this.nums = nums;
    this.sums = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        this.sums[0] = nums[0];
      }
      else {
        this.sums[i] = this.sums[i - 1] + this.nums[i];
      }
    }
  }

  public int sumRange(int i, int j) {
    return sums[j] - sums[i] + nums[i];
  }
}
