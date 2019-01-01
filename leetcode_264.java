class Solution {
  public int nthUglyNumber(int n) {
    if (n < 1) {
      return 0;
    }
    int[] uglyNumbers = new int[n];
    int index2 = 0, index3 = 0, index5 = 0;
    int factor2 = 2, factor3 = 3, factor5 = 5;
    uglyNumbers[0] = 1;
    for (int i = 1; i < n; i++) {
      int curMin = Math.min(Math.min(factor2, factor3), factor5);
      uglyNumbers[i] = curMin;
      if (factor2 == curMin) {
        factor2 = 2 * uglyNumbers[++index2];
      }
      if (factor3 == curMin) {
        factor3 = 3 * uglyNumbers[++index3];
      }
      if (factor5 == curMin) {
        factor5 = 5 * uglyNumbers[++index5];
      }
    }
    return uglyNumbers[n - 1];
  }
}
