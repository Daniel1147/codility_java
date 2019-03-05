package leetcode.minimum_add_to_make_parentheses_valid;

import java.util.*;

class Solution {
  public int minAddToMakeValid(String S) {
    int ans, balance;

    balance = 0;
    ans = 0;

    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == '(') {
        balance++;
      } else {
        if (balance > 0) {
          balance--;
        } else {
          ans++;
        }
      }
    }

    ans += balance;

    return ans;
  }
}
