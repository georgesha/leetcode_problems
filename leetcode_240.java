class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix.length == 0 || matrix[0].length == 0) {
      return false;
    }
    int coln = matrix[0].length, rown = matrix.length;
    int i = 0, j = coln - 1;
    while (i <= rown - 1 && j >= 0) {
      if (matrix[i][j] == target) {
        return true;
      }
      else if (matrix[i][j] > target) {
        j--;
      }
      else {
        i++;
      }
    }
    return false;
  }
}
