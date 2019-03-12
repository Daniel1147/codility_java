package leetcode.longest_palindromic_substring;

import java.util.*;

class Solution {
  public String longestPalindrome(String s) {
    int[] lps;
    int max, iMax, current, len, center, iMirror, n, iLeft, iRight, centerRight, start, end;
    char[] charS;

    if (s.length() == 0)
      return "";

    n = s.length() * 2 + 1;
    charS = s.toCharArray();
    lps = new int[n];

    lps[0] = 0;
    center = 0;
    centerRight = 0;
    max = 0;
    iMax = 0;

    for (current = 1; current < n; current++) {
      if (centerRight < current) {
        // count
        for (len = 1; current - len >= 0 && current + len < n; len++) {
          iLeft = ((current - len) - 1) / 2;
          iRight = ((current + len) - 1) / 2;

          if ((current - len) % 2 == 0)
            continue;

          if (charS[iLeft] != charS[iRight])
            break;
        }

        len--;
      } else {
        iMirror = 2 * center - current;
        if (lps[iMirror] + current < centerRight) {
          len = lps[iMirror];
        } else {
          for (len = centerRight - current + 1; current - len >= 0 && current + len < n; len++) {
            iLeft = ((current - len) - 1) / 2;
            iRight = ((current + len) - 1) / 2;

            if ((current - len) % 2 == 0)
              continue;

            if (charS[iLeft] != charS[iRight])
              break;
          }

          len--;
        }
      }
      lps[current] = len;
      if (len > max) {
        max = len;
        iMax = current;
      }

      if (current + len > centerRight) {
        center = current;
        centerRight = current + len;
      }
    }

    start = ((iMax - max + 1) - 1) / 2;
    end = ((iMax + max - 1) - 1) / 2;

    return s.substring(start, end + 1);
  }
}
