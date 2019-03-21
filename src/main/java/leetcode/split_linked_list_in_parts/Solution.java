package leetcode.split_linked_list_in_parts;

import java.util.*;
import leetcode.util.*;

class Solution {
  public ListNode[] splitListToParts(ListNode root, int k) {
    int n, baseHeight, overBaseNum, nNode;
    ListNode[] result;
    ListNode last;

    result = new ListNode[k];
    if (k == 1) {
      result[0] = root;

      return result;
    }

    last = root;
    n = count(root);
    baseHeight = n / k;
    overBaseNum = n % k;

    for (int i = 0; i < k; i++) {
      nNode = baseHeight;
      if (i < overBaseNum)
        nNode++;

      if (nNode == 0) {
        result[i] = null;
        continue;
      }
      result[i] = root;

      for (int j = 0; j < nNode; j++) {
        last = root;
        root = root.next;
      }
      last.next = null;
    }

    return result;
  }

  private int count(ListNode root) {
    int result;

    result = 0;
    while (root != null) {
      root = root.next;
      result++;
    }

    return result;
  }
}
