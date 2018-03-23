package codility.max_double_slice_sum;

/* import java.util.Arrays; */

class Solution {
  public int solution(int[] A) {
    int inputLen = A.length;
    int[] leftMax = new int[inputLen];
    int[] rightMax = new int[inputLen];

    int doubleMax;

    // count left max
    leftMax[1] = 0;
    for (int i = 2; i < inputLen - 1; i++) {
      final int currentNum = A[i - 1];
      leftMax[i] = max(leftMax[i - 1] + currentNum, 0);
    }
    /* System.out.printf("left: %s\n", Arrays.toString(leftMax)); */

    // count right max
    rightMax[inputLen - 2] = 0;
    for (int i = inputLen - 3; i > 0; i--) {
      final int currentNum = A[i + 1];
      rightMax[i] = max(rightMax[i + 1] + currentNum, 0);
    }
    /* System.out.printf("right: %s\n", Arrays.toString(rightMax)); */

    doubleMax = 0;
    for (int i = 1; i < inputLen - 1; i++) {
      doubleMax = max(doubleMax, leftMax[i] + rightMax[i]);
    }

    return doubleMax;
  }

  private int max(int a, int b) {
    if (a > b) {
      return a;
    }

    return b;
  }
}
