package leetcode.string_to_integer;

import java.util.*;

class Solution {
  private int INT_MAX = (1 << 31) - 1;
  private int INT_MIN = 1 << 31;

  public int myAtoi(String str) {
    int firstNotSpace, firstNonDigit, result, digit;
    boolean negative;
    char c;

    // space
    for (firstNotSpace = 0; firstNotSpace < str.length(); firstNotSpace++) {
      if (str.charAt(firstNotSpace) != ' ')
        break;
    }
    str = str.substring(firstNotSpace, str.length());

    if (str.length() <= 0)
      return 0;

    if (str.charAt(0) == '-') {
      negative = true;
      str = str.substring(1, str.length());
    } else if (str.charAt(0) == '+') {
      negative = false;
      str = str.substring(1, str.length());
    } else
      negative = false;

    // truncate non digit
    for (firstNonDigit = 0; firstNonDigit < str.length(); firstNonDigit++) {
      c = str.charAt(firstNonDigit);
      if (c < '0' || c > '9')
        break;
    }
    str = str.substring(0, firstNonDigit);

    result = 0;
    for (int i = 0; i < str.length(); i++) {
      digit = str.charAt(i) - '0';

      if (negative) {
        digit = digit * -1;
        if ((INT_MIN - digit) / 10 > result)
          return INT_MIN;
      } else {
        if ((INT_MAX - digit) / 10 < result)
          return INT_MAX;
      }

      result = digit + result * 10;
    }

    return result;
  }
}
