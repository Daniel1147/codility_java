package codility.dominator;

class Solution {
  private static final int NO_VALUE = -1;

  public int solution(int[] A) {
    int halfN = A.length / 2;
    int stackCounter = 0;
    int stackNumber = NO_VALUE;
    for (int i = 0; i < A.length; i++) {
      final int currentNumber = A[i];

      // System.out.printf(
      //   "stack number: %d,\tstack counter: %d,\tcurrent number: %d\n",
      //   stackNumber,
      //   stackCounter,
      //   currentNumber
      // );

      if (stackCounter == 0) {
        stackNumber = currentNumber;
        stackCounter++;

        continue;
      }

      if (stackNumber == currentNumber) {
        stackCounter++;
      } else {
        stackCounter--;
        halfN--;
      }
    }

    if (stackCounter > halfN) {

      return stackNumber;
    }

    return NO_VALUE;
  }
}
