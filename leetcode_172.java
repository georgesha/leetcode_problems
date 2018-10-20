class Solution {
  public int trailingZeroes(int n) {
    if (n <= 0) {
      return 0;
    }
    int zeros = 0;
    while(n > 0) {
      zeros += n / 5;
      n /= 5;
    }
    return zeros;
  }
}
