package codility.count_factors;

class Solution {
  public int solution(int N) {
    int counter = 1;
    int i;
    int currentNum = N;

    for (i = 2; i * i <= currentNum; i++) {
      int currentCount = 0;
      while (currentNum % i == 0) {
        /* System.out.printf("%d %d\n", i, currentCount); */
        currentCount++;
        currentNum /= i;
      }

      counter *= currentCount + 1;
    }

    return counter;
  }
}
