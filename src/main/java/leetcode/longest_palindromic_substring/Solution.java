package leetcode.longest_palindromic_substring;

import java.util.*;
import com.google.gson.Gson;

class Solution {
  public String longestPalindrome(String s) {
    int n, max, maxStart, maxEnd;
    boolean[][] LPS;
    char[] charS;

    if (s.length() == 0)
      return "";

    n = s.length();
    LPS = new boolean[n + 1][n];
    charS = s.toCharArray();

    max = 1;
    maxStart = 0;
    maxEnd = 1;
    for (int i = 0; i < n; i++) {
      LPS[0][i] = true;
      LPS[1][i] = true;
    }

    for (int i = 2; i <= n; i++) {
      if (i > max + 2)
        break;
      for (int j = 0; j + i - 1 < n; j++) {
        if (LPS[i - 2][j + 1] && charS[j] == charS[j + i - 1]) {
          LPS[i][j] = true;
          if (i > max) {
            max = i;
            maxStart = j;
            maxEnd = j + i;
          }
        } else {
          LPS[i][j] = false;
        }
      }
    }

    return s.substring(maxStart, maxEnd);
  }
}
