package codility.common_prime_divisors;

import java.util.Arrays;

class Solution {
  public int solution(int[] A, int[] B) {
    int counter = 0;
    for (int i = 0; i < A.length; i++) {
      if (hasCommonPrimeDivisor(A[i], B[i])) {
        // System.out.println(A[i]);
        // System.out.println(B[i]);

        counter++;
      }
    }

    return counter;
  }

  private boolean hasCommonPrimeDivisor(int a, int b) {
    int gcdOfTwo = gcd(a, b);
    int tmpGcd;

    // System.out.printf("%d, %d, %d\n", a, b, gcdOfTwo);
    while(a != 1) {
      tmpGcd = gcd(a, gcdOfTwo);
      if (tmpGcd == 1) {
        return false;
      }
      a /= tmpGcd;
    }

    while(b != 1) {
      tmpGcd = gcd(b, gcdOfTwo);
      // System.out.printf("b: %d, tmp gcd %d\n", b, tmpGcd);
      if (tmpGcd == 1) {
        return false;
      }
      b /= tmpGcd;
    }

    return true;
  }

  private int gcd(int a, int b) {
    if (a == 0) {
      return b;
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
