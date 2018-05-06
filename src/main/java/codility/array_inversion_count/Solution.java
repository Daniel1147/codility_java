package codility.array_inversion_count;

import java.util.*;

class Solution {
  public int solution(int[] A) {
    int ans;

    if (A.length <= 1)
      return 0;

    ans = count(A, 0, A.length - 1);
    return ans;
  }

  private int count(int[] numList, int indexStart, int indexEnd) {
    // System.out.println("indexStart => " + indexStart + ", indexEnd => " + indexEnd);

    if (indexStart >= indexEnd)
      return 0;

    int indexMid, countLeft, countRight, result;

    indexMid = (indexStart + indexEnd) / 2;
    // System.out.println("indexMid => " + indexMid);

    countLeft = count(numList, indexStart, indexMid);
    countRight = count(numList, indexMid + 1, indexEnd);

    result = countLeft + countRight;

    int[] numListLeft, numListRight;
    int lenLeft, lenRight, indexLeft, indexRight, indexSum;

    lenLeft = indexMid - indexStart + 1;
    lenRight = indexEnd - indexMid;

    numListLeft = new int[lenLeft];
    System.arraycopy(numList, indexStart, numListLeft, 0, lenLeft);
    numListRight = new int[lenRight];
    System.arraycopy(numList, indexMid + 1, numListRight, 0, lenRight);

    countLeft = 0;
    indexLeft = 0;
    indexRight = 0;

    while (indexLeft < lenLeft || indexRight < lenRight) {
      indexSum = indexLeft + indexRight + indexStart;
      if (indexLeft == lenLeft) {
        // insert from right
        numList[indexSum] = numListRight[indexRight];
        indexRight++;
        result += countLeft;

        continue;
      }

      if (indexRight == lenRight) {
        // insert from left
        numList[indexSum] = numListLeft[indexLeft];
        indexLeft++;

        continue;
      }

      if (numListLeft[indexLeft] <= numListRight[indexRight]) {
        // insert from right
        numList[indexSum] = numListRight[indexRight];
        indexRight++;
        result += countLeft;

        continue;
      }

      // insert from left
      numList[indexSum] = numListLeft[indexLeft];
      indexLeft++;
      countLeft++;
    }

    // System.out.println("result => " + result);

    return result;
  }
}
