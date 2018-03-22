package codility.max_slice_sum;

class Solution {
  public int solution(int[] A) {
    int maxSliceSum = 0;
    int maxSliceEnd = 0;

    for (int i = 0; i < A.length; i++) {
      final int currentNum = A[i];
      maxSliceEnd = max(0, maxSliceEnd + currentNum);
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
