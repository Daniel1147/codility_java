package leetcode.find_and_replace_pattern;

import java.util.*;

class Solution {
  public List<String> findAndReplacePattern(String[] words, String pattern) {
    int[] unifyPattern = unify(pattern);
    int[] unifyWord;
    List<String> result = new ArrayList<String>();

    for (int i = 0; i < words.length; i++) {
      unifyWord = unify(words[i]);
      if (Arrays.equals(unifyPattern, unifyWord))
        result.add(words[i]);
    }

    return result;
  }

  private int[] unify(String str) {
    int[] map, demap, result;
    char c;
    int mapCnt;
    map = new int[256];
    demap = new int[256];

    mapCnt = 0;
    for (int i = 0; i < str.length(); i++) {
      c = str.charAt(i);

      if (map[c] == 0) {
        mapCnt++;
        map[c] = mapCnt;
        demap[mapCnt] = c;
      }
    }

    result = new int[str.length()];

    for (int i = 0; i < str.length(); i++) {
      result[i] = map[str.charAt(i)];
    }

    return result;
  }
}
