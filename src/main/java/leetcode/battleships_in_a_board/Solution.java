package leetcode.battleships_in_a_board;

import java.util.*;

class Solution {
  private int DEFAULT_RECORD_LEN = 100;

  public int countBattleships(char[][] board) {
    int[] record;
    int ans;
    boolean rowShip;
    char c;

    if (board.length == 0 || board[0].length == 0)
      return 0;

    if (DEFAULT_RECORD_LEN < board[0].length)
      record = new int[board[0].length];
    else
      record = new int[DEFAULT_RECORD_LEN];

    ans = 0;
    for (int i = 0; i < board.length; i++) {
      rowShip = false;
      for (int j = 0; j < board[i].length; j++) {
        c = board[i][j];

        if (rowShip) {
          if (c != 'X') {
            rowShip = false;
            if (record[j] == 1)
              record[j] = 0;
          }

          continue;
        }

        if (record[j] == 1) {
          if (c != 'X')
            record[j] = 0;

          continue;
        }

        if (c == '.')
          continue;

        ans++;
        if (j + 1 < board[i].length && board[i][j + 1] == 'X')
          rowShip = true;
        else {
          record[j] = 1;
        }
      }
    }

    return ans;
  }
 }
