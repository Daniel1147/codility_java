package random.find_sets_of_numbers_that_add_up_to_16;

import java.util.*;

class Solution {
  public int solution(int[] numList, int sum) {
    // let m[i][j] be the solution of first i in numlist and sum = j
    int[][] m;
    int roundSum, lastNum, lastNumIndex;

    m = new int[numList.length + 1][];

    for (int i = 0; i < numList.length + 1; i++)
      m[i] = new int[sum + 1];

    for (int i = 0; i < numList.length + 1; i++) {
      for (int localSum = 0; localSum < sum + 1; localSum++) {
        roundSum = 0;

        if (localSum == 0) {
          m[i][localSum] = 1;
          continue;
        }

        lastNumIndex = i - 1;
        if (lastNumIndex < 0) {
          m[i][localSum] = roundSum;
          continue;
        }

        lastNum = numList[lastNumIndex];
        if (localSum - lastNum >= 0)
          roundSum += m[i - 1][localSum - lastNum];

        roundSum += m[i - 1][localSum];

        m[i][localSum] = roundSum;
      }
    }

    // System.out.printf(Arrays.toString(m[numList.length]));

    return m[numList.length][sum];
  }
}
