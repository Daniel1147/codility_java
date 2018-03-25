package codility.count_factors;

class Solution {
  public int solution(int N) {
    int counter = 0;
    int i;

    int sqrtN = (int) Math.sqrt(N);

    for (i = 1; i <= sqrtN; i++) {
      if (N % i == 0) {
        counter += 2;
      }
    }

    /* System.out.printf("i = %d, sqrt of n is %d\n", i, sqrtN); */

    i = i - 1;
    if (i * i == N) {
      counter -= 1;
    }

    return counter;
  }
}
