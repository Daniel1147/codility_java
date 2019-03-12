package leetcode.palindromic_substrings;

import java.util.*;

class Solution {
  private int n;
  private char[] charS;

  public int countSubstrings(String s) {
    char[] charS;
    int[] lps;
    int current, i, center, n, ans, currentLeft;

    n = s.length() * 2 + 1;

    lps = new int[n];
    charS = new char[n];

    for (i = 0; i < s.length(); i++) {
      charS[i * 2 + 1] = s.charAt(i);
    }

    for (i = 0; i < n; i+= 2) {
      charS[i] = '.';
    }

    lps[0] = 0;
    center = 0;
    ans = 0;

    for (current = 1; current < n; current++) {
      if (center + lps[center] < current) {
        for (i = 0; current - i >= 0 && current + i < n; i++) {
          if (charS[current + i] != charS[current - i])
            break;
        }

        lps[current] = i - 1;
      } else {
        currentLeft = center * 2 - current;

        if (center + lps[center] > i + lps[currentLeft])
          lps[current] = lps[currentLeft];
        else {
          for (i = lps[currentLeft] + 1; current + i < n && current - i >= 0; i++)
            if (charS[i + current] != charS[current - i])
              break;

          lps[current] = i - 1;
        }
      }

      ans += (lps[current] + 1) / 2;
    }

    return ans;
  }
}
