package codility.count_distinct_slices;

import java.util.Arrays;

class Solution {
  private final int max = 1000000000;
  public int solution(int M, int[] A) {
    int N = A.length;
    int counter = 0, count;
    int[] exist = new int[M + 1];
    int indexStart, indexEnd;
    int income, outcome;



    // init
    indexStart = 0;
    indexEnd = 0;
    counter++;
    exist[A[0]]++;

    while(indexEnd < N - 1 && indexStart < N) {
      income = A[indexEnd + 1];
      if (exist[income] == 0) {
        // end step one
        indexEnd++;
        exist[income] = 1;
        count = indexEnd - indexStart + 1;
        // System.out.printf("count: %d\n", count);
        counter += count;
        if (counter >= max) {
          return max;
        }

      } else {
        // start step one
        outcome = A[indexStart];
        exist[outcome] = 0;
        indexStart++;
      }

    }

    return counter;
  }
}
