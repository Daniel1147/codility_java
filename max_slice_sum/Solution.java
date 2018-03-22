package codility.max_slice_sum;

class Solution {
  public int solution(int[] A) {
    int maxSliceSum;
    int maxSliceEnd = 0;

    if (A.length < 1) {
      return 0;
    }
    maxSliceSum = A[0];

    for (int i = 0; i < A.length; i++) {
      final int currentNum = A[i];
      maxSliceEnd = max(currentNum, maxSliceEnd + currentNum);
      maxSliceSum = max(maxSliceSum, maxSliceEnd);
    }

    return maxSliceSum;
  }

  private int max(int a, int b) {
    if (a > b) {

      return a;
    }

    return b;
  }
}
