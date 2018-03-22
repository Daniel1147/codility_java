package codility.max_profit;

class Solution {
  public int solution(int[] A) {
    int maxProfit = 0;
    int lowestPrice;

    if (A.length < 1) {
      return maxProfit;
    }
    lowestPrice = A[0];

    for (int i = 0; i < A.length; i++) {
      final int currentPrice = A[i];
      maxProfit = max(maxProfit, currentPrice - lowestPrice);

      if (currentPrice < lowestPrice) {
        lowestPrice = currentPrice;
      }
    }

    return maxProfit;
  }

  private int max(int a, int b) {
    if (a > b) {
      return a;
    }
    return b;
  }
}
