package leetcode.longest_palindromic_substring;

import java.util.*;
import com.google.gson.Gson;

class Solution {
  public String longestPalindrome(String s) {
    int n, max, len;
    String maxS;
    int[][] LPS;

    if (s.length() == 0)
      return "";

    n = s.length();
    LPS = new int[n + 1][n];

    max = 1;
    maxS = s.substring(0, 1);
    for (int i = 0; i < n; i++) {
      LPS[1][i] = 1;
    }

    for (int i = 2; i <= n; i++) {
      for (int j = 0; j + i - 1 < n; j++) {
        if (LPS[i - 2][j + 1] != -1 && s.charAt(j) == s.charAt(j + i - 1)) {
          len = LPS[i - 2][j + 1] + 2;
          LPS[i][j] = len;
          if (len > max) {
            max = len;
            maxS = s.substring(j, j + i);
          }
        } else {
          LPS[i][j] = -1;
        }
      }
    }

    return maxS;
  }
}
