package leetcode.complex_number_multiplication;

import java.util.*;

class Solution {
  public String complexNumberMultiply(String a, String b) {
    int aR, aI, bR, bI, ansR, ansI, pI;

    pI = a.indexOf('+');
    aR = Integer.parseInt(a.substring(0, pI));
    aI = Integer.parseInt(a.substring(pI + 1, a.length() - 1));

    pI = b.indexOf('+');
    bR = Integer.parseInt(b.substring(0, pI));
    bI = Integer.parseInt(b.substring(pI + 1, b.length() - 1));

    ansR = aR * bR - aI * bI;
    ansI = aR * bI + aI * bR;

    return ansR + "+" + ansI + "i";
  }
}
