package codility.min_abs_sum;

import java.util.Arrays;

class Solution {
  private final int maxA = 100;
  private int offset, N, lastMin, lastMax, count2Read, count2Write, mark, nextMark;
  private int[][] count2;

  public int solution(int[] A) {
    N = A.length;
    offset = maxA * N;

    count2 = new int[2][];
    count2[0] = new int[offset * 2 + 1];
    count2[1] = new int[offset * 2 + 1];

    lastMin = offset;
    lastMax = offset;

    count2[0][offset] = 1;

    for (int i = 0; i < N; i++) {
      mark = i + 1;
      nextMark = mark + 1;

      count2Read = i % 2;
      count2Write = (i + 1) % 2;

      for (int j = lastMin; j < offset * 2 + 1 && j <= lastMax; j++) {
        if (count2[count2Read][j] == mark) {
          count2[count2Write][j - A[i]] = nextMark;
          count2[count2Write][j + A[i]] = nextMark;
        }
      }

      lastMin = lastMin - A[i];
      lastMax = lastMax + A[i];
    }

    return minAbs();
  }

  private int minAbs() {
    int posAbs, negAbs;
    int index = N % 2;

    mark = N + 1;
    if (count2[index][offset] == mark) {
      return 0;
    }

    posAbs = offset + 1;
    for (int i = 1; i <= offset; i++) {
      if (count2[index][i + offset] == mark) {
        posAbs = i;

        break;
      }
    }

    negAbs = offset + 1;
    for (int i = 1; i <= offset; i++) {
      if (count2[index][offset - i] == mark) {
        negAbs = i;

        break;
      }
    }

    if (negAbs < posAbs) {
      return negAbs;
    }

    return posAbs;
  }
}
