package leetcode.longest_palindromic_substring;

import java.util.*;
import com.google.gson.Gson;

class Solution {
  public String longestPalindrome(String s) {
    int n, max, len, maxStart, maxEnd;
    int[][] LPS;

    if (s.length() == 0)
      return "";

    n = s.length();
    LPS = new int[n + 1][n];

    max = 1;
    maxStart = 0;
    maxEnd = 1;
    for (int i = 0; i < n; i++) {
      LPS[1][i] = 1;
    }

    for (int i = 2; i <= n; i++) {
      if (i > max + 2)
        break;
      for (int j = 0; j + i - 1 < n; j++) {
        if (LPS[i - 2][j + 1] != -1 && s.charAt(j) == s.charAt(j + i - 1)) {
          len = LPS[i - 2][j + 1] + 2;
          LPS[i][j] = len;
          if (len > max) {
            max = len;
            maxStart = j;
            maxEnd = j + i;
          }
        } else {
          LPS[i][j] = -1;
        }
      }
    }

    return s.substring(maxStart, maxEnd);
  }
}
