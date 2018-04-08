package codility.abs_distinct;

// import static java.lang.System.out;

import java.util.Arrays;

public class Solution {
  public int solution(int[] A) {
    int divL, divR;
    int minL, minR;
    int N = A.length;
    int counter = 0;

    // find first non negetive num
    divL = -1;
    divR = N;
    for (int i = 0; i < N; i++) {
      if (A[i] < 0) {
        divL = i;
      }

      if (A[i] > 0) {
        divR = i;
        break;
      }
    }

    // out.printf("\nA: %s, divL: %d, divR: %d\n", Arrays.toString(A), divL, divR);

    // count 0
    if (divL != divR - 1) {
      counter++;
    }

    minL = 0;
    minR = 0;
    while (inRange(divR, N) || inRange(divL, N)) {
      // both in range
      if (inRange(divR, N) && inRange(divL, N)) {
        if (A[divL] * -1 < A[divR]) {
          if (A[divL] * -1 > minL) {
            counter++;
            minL = A[divL] * -1;
          }

          // out.println("step left but both");
          divL--;
        } else {
          if (A[divR] > minR) {
            if (!inRange(divL, N) || A[divL] * -1 != A[divR]) {
              counter++;
            }
            minR = A[divR];
          }

          // out.println("step right but both");
          divR++;
        }

        continue;
      }

      // only right in range
      if (inRange(divR, N)) {
        if (A[divR] > minR) {
          counter++;
          minR = A[divR];
        }
        // out.println("step right");
        divR++;

        continue;
      }

      // only left in range
      if (A[divL] * -1 > minL) {
        counter++;
        minL = A[divL] * -1;
      }
      // out.println("step left");
      divL--;
    }

    return counter;
  }

  private boolean inRange(int i, int len) {
    if (i >=0 && i < len) {
      return true;
    }

    return false;
  }
}
