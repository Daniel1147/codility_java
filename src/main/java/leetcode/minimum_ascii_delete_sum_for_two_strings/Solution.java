package leetcode.minimum_ascii_delete_sum_for_two_strings;

import java.util.*;

class Solution {
  public int minimumDeleteSum(String s1, String s2) {
    char[] a1, a2;
    int[][] mds;
    int n1, n2, leftUp, up, left, min;

    if (s1.length() == 0)
      return count(s2);

    if (s2.length() == 0)
      return count(s1);

    a1 = s1.toCharArray();
    a2 = s2.toCharArray();
    n1 = a1.length;
    n2 = a2.length;

    mds = new int[n1 + 1][n2 + 1];

    for (int i = 1; i <= n1; i++) {
      mds[i][0] = a1[i - 1] + mds[i - 1][0];
    }

    for (int i = 1; i <= n2; i++) {
      mds[0][i] = a2[i - 1] + mds[0][i - 1];
    }

    for (int i = 1; i <= n1; i++) {
      for (int j = 1; j <= n2; j++) {
        up = mds[i - 1][j] + a1[i - 1];
        left = mds[i][j - 1] + a2[j - 1];
        if (up < left)
          min = up;
        else
          min = left;

        if (a1[i - 1] == a2[j - 1]) {
          leftUp = mds[i - 1][j - 1];
          if (leftUp < min)
            min = leftUp;
        }

        mds[i][j] = min;
      }
    }

    return mds[n1][n2];
  }

  private int count(String s) {
    int result = 0;
    for (int i = 0; i < s.length(); i++)
      result += s.charAt(i);

    return result;
  }
}
