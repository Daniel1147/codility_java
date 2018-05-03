package codility.rectangle_builder_greater_area;

import java.util.Arrays;

class Solution {
  private final int maxResult = 1000000000;
  private int[] availableA, A;
  private int availableANum, X;

  public int solution(int[] A, int X) {
    this.A = A;
    this.X = X;

    if (A.length == 0) {
      return 0;
    }

    Arrays.sort(A);

    buildAvailableA();
    // System.out.printf(
    //     "availableA => %s, availableANum => %d\n", Arrays.toString(availableA), availableANum);

    int lastA, startA, currentA, ans, ansNum;
    double area;

    lastA = availableANum - 1;
    ans = 0;
    for (startA = 0; startA < availableANum; startA++) {
      lastA = lastAvailableFence(startA, lastA);

      ansNum = availableANum - lastA;

      // System.out.printf("start => %d, last => %d\n", startA, lastA);

      ans += ansNum;
      if (ans > maxResult)
        return -1;
    }

    int[] squareList = new int[A.length / 4];
    int squareListNum, count, lastNum;

    lastNum = A[0];
    count = 1;
    squareListNum = 0;

    for (int i = 1; i < A.length; i++) {
      if (A[i] != lastNum) {
        lastNum = A[i];
        count = 1;
        continue;
      }

      count++;
      if (count == 4) {
        squareList[squareListNum] = lastNum;
        squareListNum++;
      }

    }

    // System.out.printf("square list => %s\n", Arrays.toString(squareList));

    int currentSquare;
    double piece;
    for (currentSquare = 0; currentSquare < squareListNum; currentSquare++) {
      piece = (double) squareList[currentSquare];
      if (piece * piece >= (double)X) {
        break;
      }
    }

    // System.out.printf("squre min index => %d, square list num => %d, ans => %d\n", currentSquare, squareListNum, ans);

    ans += squareListNum - currentSquare;

    if (ans > maxResult)
      return -1;

    return ans;
  }

  private void buildAvailableA() {
    availableA = new int[A.length];
    availableANum = 0;

    int lastA = A[0];
    int count = 1;

    for (int i = 1; i < A.length; i++) {
      if (A[i] == lastA) {
        count++;

        if (count == 2) {
          availableA[availableANum] = lastA;
          availableANum++;
        }

        continue;
      }

      lastA = A[i];
      count = 1;
    }
  }

  private int lastAvailableFence(int fence1Index, int startSearch) {
    int fence2Index;
    double area, fence1Length, fence2Length;
    fence1Length = availableA[fence1Index];

    for (fence2Index = startSearch; fence2Index > fence1Index; fence2Index--) {
      fence2Length = (double) availableA[fence2Index];
      area = fence1Length * fence2Length;
      if (area < X) {
        break;
      }
    }

    if (fence2Index < availableANum)
      return fence2Index + 1;

    return fence2Index;
  }
}
