package leetcode.longest_palindromic_substring;

import java.util.*;

class Solution {
  public String longestPalindrome(String s) {
    char[] charS;
    int n, len, max, start, end;

    charS = s.toCharArray();
    n = charS.length;

    if (s.length() == 0)
      return "";

    start = 0;
    end = 0;

    max = 0;
    for (int i = 0; i <= 2 * n - 2; i++) {
      if (i % 2 == 0)
        len = middlePalindromeLen(charS, i / 2, i / 2);
      else
        len = middlePalindromeLen(charS, i / 2, i / 2 + 1);

      if (max < len) {
        max = len;
        if (i % 2 == 0) {
          start = i / 2 - (len - 1) / 2;
          end = i / 2 + (len - 1) / 2;
        } else {
          start = i / 2 - len / 2 + 1;
          end = i / 2 + 1 + len / 2 - 1;
        }
      }
    }


    return s.substring(start, end + 1);
  }

  private int middlePalindromeLen(char[] charS, int l, int r) {
    while (l >= 0 && r < charS.length && charS[l] == charS[r]) {
      l--;
      r++;
    }

    return r - 1 - l - 1 + 1;
  }
}
