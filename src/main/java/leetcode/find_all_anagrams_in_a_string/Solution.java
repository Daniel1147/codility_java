package leetcode.find_all_anagrams_in_a_string;

import java.util.List;
import java.util.Arrays;

class Solution {
  int[] charLeft;

  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> result;

    buildCharLeft(p);
    result = process(s, p.length());

    return result;
  }

  private void buildCharLeft(String p) {
    char c;
    int indexC;

    charLeft = new int[255];

    for (int i = 0; i < p.length(); i++) {
      charLeft[p.charAt(i)]++;
    }

    return;
  }

  private List<Integer> process(String s, int pLen) {
    int slow, fast, matchCount, resultCount;
    char newC, oldC;
    Integer[] result;

    result = new Integer[s.length()];
    resultCount = 0;

    slow = 0;
    fast = 0;
    matchCount = 0;

    while (fast < s.length()) {
      // System.out.println(String.format("slow => %d, fast => %d, matchCount => %d", slow, fast, matchCount));
      newC = s.charAt(fast);
      charLeft[newC]--;
      if (charLeft[newC] >= 0)
        matchCount++;
      fast++;

      if (matchCount == pLen) {
        result[resultCount++] = slow;
      }

      if (fast - slow == pLen) {
        charLeft[s.charAt(slow)]++;

        if (charLeft[s.charAt(slow)] > 0)
          matchCount--;

        slow++;
      }
    }

    return Arrays.asList(result).subList(0, resultCount);
  }
}
