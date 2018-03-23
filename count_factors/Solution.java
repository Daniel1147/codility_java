package codility.count_factors;

class Solution {
  public int solution(int N) {
    int counter = 0;
    int i;
    for (i = 1; i * i < N; i++) {
      if (N % i == 0) {
        counter += 2;
      }
    }

    if (i * i == N) {
      counter++;
    }

    return counter;
  }
}
