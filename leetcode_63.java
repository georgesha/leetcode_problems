class Solution {
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    if(obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
      return 0;
    }
    int[][] paths = new int[obstacleGrid.length][obstacleGrid[0].length];
    for(int i = 0; i < obstacleGrid.length; i++) {
      for(int j = 0; j < obstacleGrid[0].length; j++) {
        if(obstacleGrid[i][j] == 1) {
          paths[i][j] = 0;
        }
        else if(i == 0 && j == 0) {
          paths[i][j] = 1;
        }
        else if(i == 0 && j != 0) {
          paths[i][j] = paths[i][j - 1] == 1?1:0;
        }
        else if(i != 0 && j == 0) {
          paths[i][j] = paths[i - 1][j] == 1?1:0;
        }
        else{
          paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
        }
      }
    }
    return paths[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
  }
}
