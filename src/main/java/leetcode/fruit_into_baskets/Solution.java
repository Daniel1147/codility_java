package leetcode.fruit_into_baskets;

import java.util.*;

class Solution {
  public int totalFruit(int[] tree) {
    int line, lineType, fruitA, fruitB, max, sum;

    sum = 0;
    max = 0;
    fruitA = -1;
    fruitB = -1;
    line = 0;
    lineType = -2;

    for (int i = 0; i < tree.length; i++) {
      if (tree[i] == fruitA || tree[i] == fruitB) {
        sum++;

        if (tree[i] == lineType) {
          line++;
        } else {
          line = 1;
          lineType = tree[i];
        }
      } else {
        if (fruitA == lineType)
          fruitB = tree[i];
        else
          fruitA = tree[i];

        sum = 1 + line;
        lineType = tree[i];
        line = 1;
      }

      if (sum > max)
        max = sum;
    }

    return max;
  }
}
