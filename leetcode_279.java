// DP
class Solution {
  public int numSquares(int n) {
    int[] result = new int[n + 1];
    for (int i = 0; i < n + 1; i++) {
      if (i <= 3) {
        result[i] = i;
      }
      else {
        int min = Integer.MAX_VALUE, j = 1;
        while (i - j * j >= 0) {
          min = Math.min(min, result[i - j * j] + 1);
          j++;
        }
        result[i] = min;
      }
    }
    return result[n];
  }
}
