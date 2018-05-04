package codility.str_symmetry_point;

import java.util.Arrays;

class Solution {
  private final int invalid = -1;

  public int solution(String S) {
    int midIndex, sLen, count, leftIndex, rightIndex;

    sLen = S.length();

    if (sLen % 2 == 0)
      return invalid;

    midIndex = (sLen - 1) / 2;
    // System.out.printf("mid char %c\n", S.charAt(midIndex));
    count = 0;
    for (int i = 1; i <= (sLen - 1) / 2; i++) {
      leftIndex = midIndex - i;
      rightIndex = midIndex + i;
      // System.out.printf("left %c, right %c\n", S.charAt(leftIndex), S.charAt(rightIndex));
      if (S.charAt(leftIndex) != S.charAt(rightIndex))
        return invalid;

      count++;
    }

    return count;
  }
}
