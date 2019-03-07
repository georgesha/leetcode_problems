class Solution {
  public int countNumbersWithUniqueDigits(int n) {
    if (n == 0) {
      return 1;
    }
    int result = 10, cur = 9;
    for (int i = 2; i <= n && i < 11; i++) {
      cur = cur * (9 - i + 2);
      result += cur;
    }
    return result;
  }
}
