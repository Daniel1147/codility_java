package codility.chocolates_by_numbers;

import java.util.Arrays;

class Solution {
  public int solution(int N, int M) {
    long longN = N;
    long longM = M;
    long gcdOfTwo = gcd(longN, longM);
    int ans = (int) ((longN / gcdOfTwo) * (longM / gcdOfTwo) * gcdOfTwo / longM);

    return ans;
  }

  private long gcd(long a, long b) {
    /* System.out.printf("a: %d, b: %d\n", a, b); */
    if (a % b == 0) {
      return b;
    }

    if (a > b) {
      return gcd(b, a % b);
    }

    return gcd(a, b % a);
  }
}
