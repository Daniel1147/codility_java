package leetcode.complex_number_multiplication;

import java.util.*;

class Solution {
  public String complexNumberMultiply(String a, String b) {
    int aR, aI, bR, bI, ansR, ansI;
    String[] aS, bS;

    aS = a.split("\\+");
    aR = Integer.parseInt(aS[0]);
    aI = Integer.parseInt(aS[1].substring(0, aS[1].length() - 1));

    bS = b.split("\\+");
    bR = Integer.parseInt(bS[0]);
    bI = Integer.parseInt(bS[1].substring(0, bS[1].length() - 1));

    ansR = aR * bR - aI * bI;
    ansI = aR * bI + aI * bR;

    return String.format("%s+%si", Integer.toString(ansR), Integer.toString(ansI));
  }
}
