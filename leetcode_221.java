class Solution {
  public int maximalSquare(char[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return 0;
    }
    int coln = matrix.length, rown = matrix[0].length, l = 0;
    int[][] dp = new int[coln + 1][rown + 1];
    for (int i = 1; i <= coln; i++) {
      for (int j = 1; j <= rown; j++) {
        if (matrix[i - 1][j - 1] == '1') {
          dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
        }
        l = Math.max(dp[i][j], l);
      }
    }
    return l * l;
  }
}
