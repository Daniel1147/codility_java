package codility.longest_substring_without_repeating_characters;

import java.util.*;

class Solution {
  public int lengthOfLongestSubstring(String s) {
    int[] lofs;
    int lenS, lastLofs, result;
    char currentChar, charToCompare;

    lenS = s.length();
    if (lenS == 0)
      return 0;

    lofs = new int[s.length()];
    lofs[0] = 1;

    for (int i = 1; i < lenS; i++) {
      lastLofs = lofs[i - 1];
      currentChar = s.charAt(i);
      for (int j = 0; j < lastLofs; j++) {
        charToCompare = s.charAt(i - j - 1);
        if (currentChar == charToCompare) {
          lofs[i] = j + 1;
        }
      }

      if (lofs[i] == 0)
        lofs[i] = lastLofs + 1;
    }

    result = 1;
    for (int i = 0; i < lenS; i++) {
      if (result < lofs[i])
        result = lofs[i];
    }

    return result;
  }
}
