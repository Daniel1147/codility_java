package leetcode.find_all_anagrams_in_a_string;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
  int[] charLeft;

  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> result;

    buildCharLeft(p);
    result = process(s, p.length());

    return result;
  }

  private void buildCharLeft(String p) {
    charLeft = new int[255];

    for (char c : p.toCharArray())
      charLeft[c]++;

    return;
  }

  private List<Integer> process(String s, int pLen) {
    int slow, fast, matchCount, resultCount;
    char newC, oldC;
    char[] sArr;
    List<Integer> result;

    result = new ArrayList<Integer> ();
    resultCount = 0;

    slow = 0;
    fast = 0;
    matchCount = 0;
    sArr = s.toCharArray();

    while (fast < sArr.length) {
      // System.out.println(String.format("slow => %d, fast => %d, matchCount => %d", slow, fast, matchCount));
      newC = sArr[fast];
      charLeft[newC]--;
      if (charLeft[newC] >= 0)
        matchCount++;
      fast++;

      if (matchCount == pLen) {
        result.add(slow);
      }

      if (fast - slow == pLen) {
        charLeft[sArr[slow]]++;

        if (charLeft[sArr[slow]] > 0)
          matchCount--;

        slow++;
      }
    }

    return result;
  }
}
