package codility.count_non_divisible;

import java.util.Arrays;

class Solution {
  public int[] solution(int[] A) {
    int N = A.length;
    int[] ans = new int[A.length];
    int[] count = new int[2 * N + 2];
    int[] divisionCount = new int[2 * N + 2];
    int currentNum, i, j, iterationSum;

    for (i = 0; i < A.length; i++) {
      count[A[i]]++;
    }

    for (i = 1; i < 2 * N + 2; i++) {
      if (count[i] != 0) {
        currentNum = count[i];
        for (j = i; j < 2 * N + 2; j += i) {
          divisionCount[j] += currentNum;
        }
      }
    }

    for (i = 0; i < A.length; i++) {
      currentNum = A[i];
      ans[i] = A.length - divisionCount[currentNum];
      /* System.out.printf("current num: %d\ndivision count: %d\n", currentNum, divisionCount[currentNum]); */
    }

    /* System.out.printf("count: %s\ndivision count: %s\n", Arrays.toString(count), Arrays.toString(divisionCount)); */

    return ans;
  }
}
