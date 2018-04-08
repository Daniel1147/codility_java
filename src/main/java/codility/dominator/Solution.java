package codility.dominator;

class Solution {
  private static final int NO_VALUE = -1;

  public int solution(int[] A) {
    int halfN = A.length / 2;
    int stackCounter = 0;
    int stackNumber = NO_VALUE;
    int stackNumberIndex = 0;
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
        stackNumberIndex = i;
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

      return lastCheck(stackNumber, A);
    }

    return NO_VALUE;
  }

  private int lastCheck(int candicate, int[] input) {
    int counter = 0;
    int firstIndex = -1;

    for (int i = 0; i < input.length; i++) {
      if (input[i] == candicate) {
        counter++;

        if (firstIndex == -1) {
          firstIndex = i;
        }
      }
    }

    if (counter > input.length / 2) {
      return firstIndex;
    }

    return NO_VALUE;
  }
}
