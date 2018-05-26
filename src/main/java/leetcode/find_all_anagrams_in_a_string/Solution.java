package leetcode.find_all_anagrams_in_a_string;

import java.util.ArrayList;
import java.util.List;

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

    charLeft = new int[26];

    for (int i = 0; i < p.length(); i++) {
      indexC = cIndex(p.charAt(i));
      charLeft[indexC]++;
    }

    return;
  }

  private List<Integer> process(String s, int pLen) {
    int slow, fast, matchCount, indexNewC, oldIndexC;
    List<Integer> result;

    slow = 0;
    fast = 0;
    matchCount = 0;
    result = new ArrayList<Integer>();

    while (fast < s.length()) {
      // System.out.println(String.format("slow => %d, fast => %d, matchCount => %d", slow, fast, matchCount));
      indexNewC = cIndex(s.charAt(fast));
      charLeft[indexNewC]--;
      if (charLeft[indexNewC] >= 0)
        matchCount++;
      fast++;

      if (matchCount == pLen) {
        result.add(slow);
      }

      if (fast - slow == pLen) {
        oldIndexC = cIndex(s.charAt(slow));
        charLeft[oldIndexC]++;

        if (charLeft[oldIndexC] > 0)
          matchCount--;

        slow++;
      }
    }

    return result;
  }

  private int cIndex(char c) {
    return c - 'a';
  }
}
