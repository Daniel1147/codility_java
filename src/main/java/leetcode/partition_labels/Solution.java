package leetcode.partition_labels;

import java.util.*;

class Solution {
  public List<Integer> partitionLabels(String S) {
    List<Integer> result = new ArrayList<Integer>();
    int n = S.length();
    int start, end, cnt;
    char c;
    int[] record = new int[n];

    for (c = 'a'; c <= 'z'; c++) {
      start = S.indexOf(c);
      if (start == -1)
        continue;
      end = S.lastIndexOf(c);

      for (int i = start + 1; i <= end; i++)
        record[i] = 1;
    }

    cnt = 1;
    for (int i = 1; i < n; i++) {
      if (record[i] == 0) {
        result.add(cnt);
        cnt = 0;
      }

      cnt++;
    }

    if (cnt != 0) {
      result.add(cnt);
    }

    return result;
  }
}
