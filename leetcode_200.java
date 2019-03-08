class Solution {
  public int numIslands(char[][] grid) {
    if (grid == null || grid.length == 0 || grid[0].length == 0) {
      return 0;
    }
    int count = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == '1') {
          count++;
          labelIslands(grid, i, j);
        }
      }
    }
    return count;
  }

  private void labelIslands(char[][] grid, int i, int j) {
    if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1) {
      return;
    }
    grid[i][j] = '*';
    if (i > 0 && grid[i - 1][j] == '1') {
      labelIslands(grid, i - 1, j);
    }
    if (i < grid.length - 1 && grid[i + 1][j] == '1') {
      labelIslands(grid, i + 1, j);
    }
    if (j > 0 && grid[i][j - 1] == '1') {
      labelIslands(grid, i, j - 1);
    }
    if (j < grid[0].length - 1 && grid[i][j + 1] == '1') {
      labelIslands(grid, i, j + 1);
    }
  }
}
