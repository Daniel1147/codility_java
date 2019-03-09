package leetcode.palindromic_substrings;

import java.util.*;

class Solution {
  private int n;
  private char[] charS;

  public int countSubstrings(String s) {
    int len, ans;

    if (s.length() == 0)
      return 0;

    charS = s.toCharArray();
    n = charS.length;

    ans = 0;
    for (int i = 0; i <= n * 2 - 2; i++) {
      if (i % 2 == 0) {
        len = middleAt(i / 2, i / 2);
        ans += (len + 1) / 2;
      } else {
        len = middleAt(i / 2, i / 2 + 1);
        ans += len / 2;
      }
    }

    return ans;
  }

  private int middleAt(int l, int r) {
    while (l >= 0 && r < n && charS[l] == charS[r]) {
      l--;
      r++;
    }

    return (r - 1) - (l + 1) + 1;
  }
}
