class Solution {
  public void solve(char[][] board) {
    if (board == null || board.length == 0 || board[0].length == 0) {
      return;
    }
    for (int i = 0; i < board.length; i++) {
      if (board[i][0] == 'O') {
        protect(board, i, 0);
      }
      if (board[i][board[0].length - 1] == 'O') {
        protect(board, i, board[0].length - 1);
      }
    }
    for (int j = 0; j < board[0].length; j++) {
      if (board[0][j] == 'O') {
        protect(board, 0, j);
      }
      if (board[board.length - 1][j] == 'O') {
        protect(board, board.length - 1, j);
      }
    }
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == 'O') {
          board[i][j] = 'X';
        }
        if (board[i][j] == 'p') {
          board[i][j] = 'O';
        }
      }
    }
  }

  private void protect(char[][] board, int i, int j) {
    if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
      return;
    }
    board[i][j] = 'p';
    if (i > 0 && board[i - 1][j] == 'O') {
      protect(board, i - 1, j);
    }
    if (i < board.length - 1 && board[i + 1][j] == 'O') {
      protect(board, i + 1, j);
    }
    if (j > 0 && board[i][j - 1] == 'O') {
      protect(board, i, j - 1);
    }
    if (j < board[0].length - 1 && board[i][j + 1] == 'O') {
      protect(board, i, j + 1);
    }
  }
}
