package codility.count_triangles;

import java.util.Arrays;

class Solution {
  private int N;
  private int line1, line2;
  private int counter;
  private int currentCounter;
  private int currentSum;

  public int solution(int[] A) {
    N = A.length;

    Arrays.sort(A);

    if (N < 3) {
      return 0;
    }

    counter = 0;

    for (line1 = 0; line1 < N - 2; line1++) {
      for (line2 = line1 + 1; line2 < N - 1; line2++) {
        currentCounter = 0;
        currentSum = A[line1] + A[line2];
        for (int i = line2 + 1; i < N; i++) {
          if (A[i] >= currentSum) {
            break;
          }

          currentCounter++;
        }

        counter += currentCounter;
      }
    }

    return counter;
  }
}
