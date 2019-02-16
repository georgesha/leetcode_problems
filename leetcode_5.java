class Solution {
  public String longestPalindrome(String s) {
    if (s == null || s.length() == 0) {
      return s;
    }
    int l = s.length();
    String result = "";
    boolean[][] dp = new boolean[l][l];
    for (int i = 0; i < l; i++) {
      for (int j = i; j >= 0; j--) {
        dp[i][j] = s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[i - 1][j + 1]);

        if (dp[i][j] && i - j + 1 > result.length()) {
          result = s.substring(j, i + 1);
        }
      }
    }
    return result;
  }
}
