package codility.rectangle_builder_greater_area;

import java.util.Arrays;

class Solution {
  private final int maxResult = 1000000000;
  private int[] availableA;
  private int availableANum;

  public int solution(int[] A, int X) {
    if (A.length == 0) {
      return 0;
    }

    Arrays.sort(A);

    buildAvailableA(A);
    // System.out.printf(
    //     "availableA => %s, availableANum => %d\n", Arrays.toString(availableA), availableANum);

    return 0;
  }

  private void buildAvailableA(int[] sortedA) {
    availableA = new int[sortedA.length];
    availableANum = 0;

    int lastA = sortedA[0];
    int count = 1;

    for (int i = 1; i < sortedA.length; i++) {
      if (sortedA[i] == lastA) {
        count++;

        if (count == 2) {
          availableA[availableANum] = lastA;
          availableANum++;
        }

        continue;
      }

      lastA = sortedA[i];
      count = 1;
    }
  }
}
