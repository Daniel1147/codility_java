package leetcode.palindromic_substrings;

import java.util.*;

class Solution {
  private int n;
  private char[] charS;

  public int countSubstrings(String s) {
    char[] charS;
    int[] lps;
    int current, i, center, n, ans, currentLeft, iLeft, iRight;

    n = s.length() * 2 + 1;

    lps = new int[n];
    charS = s.toCharArray();

    lps[0] = 0;
    center = 0;
    ans = 0;

    for (current = 1; current < n; current++) {
      if (center + lps[center] < current) {
        for (i = 0; current - i >= 0 && current + i < n; i++) {
          if ((current + i) % 2 == 0)
            continue;

          iLeft = (current - i - 1) / 2;
          iRight = (current + i - 1) / 2 ;
          if (charS[iLeft] != charS[iRight])
            break;
        }

        lps[current] = i - 1;
      } else {
        currentLeft = center * 2 - current;

        if (center + lps[center] > current + lps[currentLeft])
          lps[current] = lps[currentLeft];
        else {
          for (i = center + lps[center] - current + 1; current + i < n && current - i >= 0; i++) {
            if ((current + i) % 2 == 0)
              continue;

            iLeft = (current - i - 1) / 2;
            iRight = (current + i - 1) / 2 ;
            if (charS[iLeft] != charS[iRight])
              break;
          }

          lps[current] = i - 1;
        }
      }

      ans += (lps[current] + 1) / 2;
      if (center + lps[center] < current + lps[current])
        center = current;
    }

    return ans;
  }
}
