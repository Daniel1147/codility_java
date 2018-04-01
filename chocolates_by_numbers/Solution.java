package codility.chocolates_by_numbers;

import java.util.Arrays;

class Solution {
  public int solution(int N, int M) {
    long longN = N;
    long longM = M;
    long gcdOfTwo = gcd(longN, longM);
    // System.out.printf("gcd of two: %d\n", gcdOfTwo);
    int ans = (int) ((longN / gcdOfTwo) * (longM / gcdOfTwo) * gcdOfTwo / longM);

    return ans;
  }

  private long gcd(long a, long b) {
    // System.out.printf("a: %d, b: %d\n", a, b);
    if (a == 0) {
      return a;
    }

    if (b == 0) {
      return a;
    }

    if (a > b) {
      return gcd(b, a % b);
    }

    return gcd(a, b % a);
  }
}
