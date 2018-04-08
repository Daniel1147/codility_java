package codility.min_perimeter_rectangle;

class Solution {
  public int solution(int N) {
    int sqrtN = (int) Math.sqrt(N);

    while (sqrtN > 0) {
      if (N % sqrtN == 0) {
        return perimeterRectangle(sqrtN, N / sqrtN);
      }

      sqrtN--;
    }

    return 0;
  }

  private int perimeterRectangle(int a, int b) {
    return 2 * (a + b);
  }
}
