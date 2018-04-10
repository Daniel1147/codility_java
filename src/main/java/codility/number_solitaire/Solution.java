package codility.number_solitaire;

class Solution {
  public int solution(int[] A) {
    int N = A.length;
    int i, diceNum, max;
    int[] count = new int[N];

    count[0] = A[0];

    for (i = 1; i < N; i++) {
      max = count[i - 1];
      for (diceNum = 2; diceNum <= 6; diceNum++) {
        if (i - diceNum >= 0 && count[i - diceNum] > max) {
          max = count[i - diceNum];
        }
      }

      count[i] = max + A[i];
    }

    return count[N - 1];
  }
}
