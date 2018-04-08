package codility.fish;

import java.util.Stack;

class Solution {
  private static final int DIRECTION_DOWN = 0;
  private static final int DIRECTION_UP = 1;

  public int solution(int[] A, int[] B) {
    Stack<Integer> upStack = new Stack<Integer>();
    int direction, upFishSize, currentFishSize;
    int counter = 0;

    for (int i = 0; i < A.length; i++) {
      direction = B[i];
      currentFishSize = A[i];

      if (direction == DIRECTION_UP) {
        // push upStack
        upStack.push(new Integer(currentFishSize));

        continue;
      }

      // pop upStack
      while (!upStack.empty()) {
        upFishSize = upStack.peek().intValue();
        if (currentFishSize > upFishSize) {
          /* log(String.format("%d eats %d\n", currentFishSize, upFishSize)); */
          upStack.pop();
        } else {
          /* log(String.format("%d eats %d\n", upFishSize, currentFishSize)); */

          break;
        }
      }

      if (upStack.empty()) {
        /* log(String.format("%d arrives\n", currentFishSize)); */
        counter++;
      }
    }

    counter = counter + upStack.size();

    return counter;
  }

  private void log(String s) {
    /* System.out.printf(s); */
  }
}
