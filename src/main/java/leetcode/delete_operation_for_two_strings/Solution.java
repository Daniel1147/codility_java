package leetcode.delete_operation_for_two_strings;

import java.util.*;

class Solution {
  public int minDistance(String word1, String word2) {
    int n = nLCS(word1, word2);

    return word1.length() + word2.length() - n - n;
  }

  private int nLCS(String sA, String sB) {
    char[] cA, cB;
    int[][] lcs;
    int a, b, c, max;

    if (sA.length() == 0 || sB.length() == 0)
      return 0;

    cA = sA.toCharArray();
    cB = sB.toCharArray();

    lcs = new int[cA.length + 1][cB.length + 1];

    for (int i = 1; i < cA.length + 1; i++) {
      for (int j = 1; j < cB.length + 1; j++) {
        a = lcs[i - 1][j];
        b = lcs[i][j - 1];
        c = lcs[i - 1][j - 1];
        if (cA[i - 1] == cB[j - 1])
          c++;

        max = Math.max(a, b);
        max = Math.max(max, c);
        lcs[i][j] = max;
      }
    }

    return lcs[cA.length][cB.length];
  }
}
