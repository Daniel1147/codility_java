package codility.count_semiprimes;

import java.util.Arrays;

class Solution {
  public int[] solution(int N, int[] P, int[] Q) {
    int[] prime = new int[N + 1];
    int[] semiprime = new int[N + 1];
    int[] semiprimeCount = new int[N + 1];
    int[] ans = new int[P.length];

    for (int i = 2; i < N + 1; i++) {
      if (prime[i] == 0) {
        for (int j = i * i; j < N + 1; j += i) {
          if (prime[j] == 0) {
            prime[j] = i;
          }
        }
      } else if (semiprime[i] == 0) {
        if (prime[i / prime[i]] == 0) {
          semiprime[i] = i / prime[i];
        }
      }
    }

    int semiprimeCounter = 0;
    for (int i = 2; i < N + 1; i++) {
      if (semiprime[i] != 0) {
        semiprimeCounter++;
      }

      semiprimeCount[i] = semiprimeCounter;
    }

    int countBeforeP;
    for (int i = 0; i < P.length; i++) {
      ans[i] = semiprimeCount[Q[i]] - semiprimeCount[P[i] - 1];
    }

    int[] index = new int[N + 1];
    for (int i = 0; i < N + 1; i++) {
      index[i] = i;
    }

    // System.out.printf("index:\t\t%s\n", intArrToString(index));
    // System.out.printf("prime:\t\t%s\n", intArrToString(prime));
    // System.out.printf("semiprime:\t%s\n", intArrToString(semiprime));
    // System.out.printf("semiprime count:%s\n", intArrToString(semiprimeCount));

    return ans;
  }

  // private String intArrToString(int[] numList) {
  //   String result = "[";
  //   boolean start = true;
  //   for (int i = 0; i < numList.length; i++) {
  //     if (!start) {
  //       result = result.concat(",");
  //     } else {
  //       start = false;
  //     }
  //     result = result.concat(String.format("%2d", numList[i]));
  //   }
  //   result = result.concat("]");
  //
  //   return result;
  // }
}
