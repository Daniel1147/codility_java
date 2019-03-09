package leetcode.spiral_matrix_iii;

import java.util.*;

class Solution {
  private int[][] result;
  private int R, C;
  private int num;

  public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
    int moveDistance, dirCnt, moveLeft;
    int[] dirX = new int[] {1, 0, -1, 0};
    int[] dirY = new int[] {0, 1, 0, -1};

    this.R = R;
    this.C = C;

    num = 0;
    result = new int[R * C][];
    moveDistance = 2;
    dirCnt = 0;

    checkAndAdd(r0, c0);

    while (num < R * C) {
      for (moveLeft = moveDistance / 2; moveLeft > 0; moveLeft--) {
        c0 += dirX[dirCnt];
        r0 += dirY[dirCnt];

        checkAndAdd(r0, c0);
      }

      moveDistance++;
      dirCnt = (dirCnt + 1) % 4;
    }

    return result;
  }

  private void checkAndAdd(int x, int y) {
    if (x >= 0 && x < R && y >= 0 && y < C) {
      result[num] = new int[] {x, y};
      num++;
    }
  }
}
