package leetcode.battleships_in_a_board;

import java.util.*;

class Solution {
  public int countBattleships(char[][] board) {
    Set<Integer> record = new HashSet<Integer>();
    int ans;
    boolean rowShip;
    char c;

    ans = 0;
    for (int i = 0; i < board.length; i++) {
      rowShip = false;
      for (int j = 0; j < board[i].length; j++) {
        c = board[i][j];

        if (rowShip) {
          if (c != 'X') {
            rowShip = false;
            if (record.contains(j))
              record.remove(j);
          }

          continue;
        }

        if (record.contains(j)) {
          if (c != 'X')
            record.remove(j);

          continue;
        }

        if (c == '.')
          continue;

        ans++;
        if (j + 1 < board[i].length && board[i][j + 1] == 'X')
          rowShip = true;
        else {
          record.add(j);
        }
      }
    }

    return ans;
  }
 }
