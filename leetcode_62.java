class Solution {
  public int uniquePaths(int m, int n) {
    if (m == 0 || n == 0) {
      return 0;
    }
    int[][] paths = new int[m][n];
    for(int i = 0; i < m; i++) {
      for(int j = 0; j < n; j++) {
        if (i == 0 || j == 0) {
          paths[i][j] = 1;
        }
        else{
          paths[i][j] = paths[i][j - 1] + paths[i - 1][j];
        }
      }
    }
    return paths[m - 1][n - 1];
  }
}
