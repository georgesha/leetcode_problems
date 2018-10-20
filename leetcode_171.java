class Solution {
  public int titleToNumber(String s) {
    char[] arr = s.toCharArray();
    int result = 0;
    for (char c:arr) {
      result = result * 26 + c -'A' + 1;
    }
    return result;
  }
}
