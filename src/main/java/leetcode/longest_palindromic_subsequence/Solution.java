package leetcode.longest_palindromic_subsequence;

import java.util.*;

class Solution {
  public int longestPalindromeSubseq(String s) {
    int[][] LPS;
    int n, l, r, max;
    char c;
    char[] charS;

    if (s.length() == 0)
      return 0;

    n = s.length();
    LPS = new int[n + 1][n];
    charS = s.toCharArray();

    for (int i = 0; i < n; i++) {
      LPS[1][i] = 1;
    }

    for (int i = 2; i < n + 1; i++) {
      for (int j = 0; j + i - 1 < n; j++) {
        l = j;
        r = j + i - 1;

        if (LPS[i - 1][l] >= LPS[i - 1][l + 1]) {
          max = LPS[i - 1][l];
        } else {
          max = LPS[i - 1][l + 1];
        }

        if (charS[l] == charS[r] && max < LPS[i - 2][l + 1] + 2) {
          max = LPS[i - 2][l + 1] + 2;
        }

        LPS[i][j] = max;
      }
    }

    return LPS[n][0];
  }
}
