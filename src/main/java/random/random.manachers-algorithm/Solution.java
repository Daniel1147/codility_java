package random.manachers_algorithm;

import java.util.*;

class Solution {
  private boolean VERBOSE = true;
  public String LPS(String str) {
    char[] charS;
    int[] lps;
    int center, centerRight, currentLeft, current, n, i, max, iMax, start, end;
    String ans;

    if (str.length() == 0)
      return "";

    n = str.length() * 2 + 1;
    charS = new char[n];
    lps = new int[n];

    for (int position = 0; position < n; position++) {
      if (position % 2 == 0)
        charS[position] = '.';
      else
        charS[position] = str.charAt(position / 2);
    }

    lps[0] = 0;
    center = 0;
    max = 0;
    iMax = 0;

    for (current = 1; current < n; current++) {
      if (current > center + lps[center]) {
        // compare char
        for (i = 0; current - i >= 0 && current + i < n; i++) {
          if (charS[current - i] != charS[current + i])
            break;
        }
        lps[current] = i - 1;
      } else {
        currentLeft = 2 * center - current;

        if (center + lps[center] - current > lps[currentLeft]) {
          // case 1
          lps[current] = lps[currentLeft];
        } else {
          // case 2 3 4
          for (i = center + lps[center] - current + 1; current + i < n && current - i >= 0; i++) {
            if (charS[current + i] != charS[current - i])
              break;
          }

          lps[current] = i - 1;
        }
      }

      // update center
      if (center + lps[center] < current + lps[current])
        center = current;

      if (max < lps[center]) {
        iMax = center;
        max = lps[center];
      }
    }

    if (VERBOSE) {
      System.out.println(Arrays.toString(lps));
      System.out.println(Arrays.toString(charS));

      lps = new int[n];
      for (i = 0; i * 2 + 1 < n; i++)
        lps[i * 2 + 1] = i % 10;
      System.out.println(Arrays.toString(lps));
      lps = new int[n];

      for (i = 0; i < n; i++) {
        lps[i] = i % 10;
      }
      System.out.println(Arrays.toString(lps));
      System.out.printf("max: %d, iMax: %d\n", max, iMax);
    }

    start = ((iMax - max + 1) - 1) / 2;
    end = ((iMax + max - 1) - 1) / 2;
    ans = str.substring(start, end + 1);

    return ans;
  }
}
