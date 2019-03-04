package leetcode.available_captures_for_rook;

import java.util.*;

class Solution {
  private int BORDER = 8;

  public int numRookCaptures(char[][] board) {
    boolean done;
    int x, y;
    int ans = 0;

    // locate rook
    done = false;
    x = -1;
    y = -1;
    for (int i = 0; i < BORDER && !done; i++) {
      for (int j = 0; j < BORDER && !done; j++) {
        if (board[i][j] == 'R') {
          done = true;
          x = i;
          y = j;
        }
      }
    }

    if (canCapture(board, x, y, 1, 0)) {
      ans++;
    }

    if (canCapture(board, x, y, -1, 0)) {
      ans++;
    }

    if (canCapture(board, x, y, 0, 1)) {
      ans++;
    }

    if (canCapture(board, x, y, 0, -1)) {
      ans++;
    }

    return ans;
  }

  private boolean canCapture(char[][] board, int x, int y, int dX, int dY) {
    x += dX;
    y += dY;
    while(x >= 0 && x < BORDER && y >= 0 && y < BORDER && board[x][y] == '.') {
      x += dX;
      y += dY;
    }

    if (x < 0 || y < 0 || x >= BORDER || y >= BORDER)
      return false;

    if (board[x][y] == 'p')
      return true;

    return false;
  }
}
