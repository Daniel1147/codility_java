package codility.abs_distinct;

// import static java.lang.System.out;


public class Solution {
  private int counter, divL, divR, N;
  private long minL, minR;
  private int[] A;

  public int solution(int[] A) {
    this.A = A;
    N = A.length;
    counter = 0;

    // find first non negetive num
    setDiv();

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
          stepLeft();
        } else {
          stepRightCheckLeft();
        }

        continue;
      }

      // only right in range
      if (inRange(divR, N)) {
        stepRight();

        continue;
      }

      // only left in range
      stepLeft();
    }

    return counter;
  }

  private boolean inRange(int i, int len) {
    if (i >= 0 && i < len) {
      return true;
    }

    return false;
  }

  private void stepLeft() {
    if ((long) A[divL] * -1 > minL) {
      counter++;
      minL = (long) A[divL] * -1;
    }
    divL--;
  }

  private void stepRightCheckLeft() {
    if ((long) A[divR] > minR) {
      if (!inRange(divL, N) || A[divL] * -1 != A[divR]) {
        counter++;
      }
      minR = (long) A[divR];
    }

    divR++;
  }

  private void stepRight() {
    if ((long) A[divR] > minR) {
      counter++;
      minR = (long) A[divR];
    }
    divR++;
  }

  private void setDiv() {
    divL = -1;
    divR = N;
    for (int i = 0; i < N; i++) {
      if (A[i] < 0) {
        divL = i;
      }

      if (A[i] > 0) {
        divR = i;
        return;
      }
    }
  }
}
