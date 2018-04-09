package codility.count_triangles;

import java.util.Arrays;

class Solution {
  private int N;
  private int line1, line2;
  private int counter;
  private int currentSum;
  private int line3;

  public int solution(int[] A) {
    N = A.length;

    Arrays.sort(A);

    if (N < 3) {
      return 0;
    }

    counter = 0;

    for (line1 = 0; line1 < N - 2; line1++) {
      line2 = line1 + 1;
      line3 = line2 + 1;
      for (; line2 < N - 1; line2++) {
        currentSum = A[line1] + A[line2];
        if (line3 == line2) {
          line3++;
        }

        while (line3 < N && A[line3] < currentSum)
          line3++;

        if (line3 - 1 > line2 && A[line3 - 1] < currentSum) {
          counter += line3 - 1 - line2;
        }
      }
    }

    return counter;
  }
}
