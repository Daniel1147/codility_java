package codility.min_abs_sum;


class Solution {
  private final int maxA = 100;
  private int N, countRead, countWrite, mark, nextMark;
  private int[][] count;

  public int solution(int[] A) {
    N = A.length;

    count = new int[2][];
    count[0] = new int[maxA * 2];
    count[1] = new int[maxA * 2];

    count[0][0] = 1;

    for (int i = 0; i < N; i++) {
      mark = i + 1;
      nextMark = mark + 1;

      countRead = i % 2;
      countWrite = (i + 1) % 2;

      for (int j = 0; j < maxA * 2; j++) {
        if (count[countRead][j] == mark) {
          markCount(countWrite, nextMark, j, A[i]);
        }
      }
    }

    return minAbs();
  }

  private void markCount(int index, int nextMark, int start, int value) {
    int result;

    result = abs(start + value);
    checkAndMark(index, nextMark, result);

    result = abs(start - value);
    checkAndMark(index, nextMark, result);
  }

  private void checkAndMark(int index, int nextMark, int position) {
    if (position < maxA * 2) {
      count[index][position] = nextMark;
    }
  }

  private int abs(int n) {
    if (n < 0) {
      return n * -1;
    }

    return n;
  }

  private int minAbs() {
    int posAbs, negAbs;
    int index = N % 2;

    mark = N + 1;
    if (count[index][0] == mark) {
      return 0;
    }

    posAbs = maxA * 2;
    for (int i = 1; i < maxA * 2; i++) {
      if (count[index][i] == mark) {
        posAbs = i;

        break;
      }
    }

    return posAbs;
  }
}
