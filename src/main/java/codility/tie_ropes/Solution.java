package codility.tie_ropes;

import java.util.Arrays;

class Solution {
  public int solution(int K, int[] A) {
    int counter = 0;
    int last = 0;

    for (int i = 0; i < A.length; i++) {
      if (last + A[i] >= K) {
        last = 0;
        counter++;

        continue;
      }

      last += A[i];
    }

    return counter;
  }
}
