package codility.longest_password;

import java.util.Arrays;

class Solution {
  private int letterUpStart, letterUpEnd, letterLowStart, letterLowEnd, digitStart, digitEnd;

  public int solution(String S) {
    String[] wordList = S.split(" ");
    int max = -1;

    setBound();

    for (int i = 0; i < wordList.length; i++) {
      if (valid(wordList[i]) && max < wordList[i].length()) {
        max = wordList[i].length();
      }
    }

    return max;
  }

  private void setBound() {
    letterUpStart = (int) 'A';
    letterUpEnd = (int) 'Z';
    letterLowStart = (int) 'a';
    letterLowEnd = (int) 'z';
    digitStart = (int) '0';
    digitEnd = (int) '9';
  };

  private boolean valid(String pass) {
    if (countDigit(pass) % 2 == 0) {
      return false;
    }

    if (countLetter(pass) % 2 == 1) {
      return false;
    }

    if (containIlligal(pass)) {
      return false;
    }

    return true;
  }

  private int countLetter(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (isLetter(s.charAt(i)))
        count++;
    }
    return count;
  }

  private int countDigit(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (isDigit(s.charAt(i)))
        count++;
    }
    return count;
  }

  private boolean isLetter(char c) {
    int intC = (int) c;

    if (intC >= letterUpStart && intC <= letterUpEnd)
      return true;

    if (intC >= letterLowStart && intC <= letterLowEnd)
      return true;

    return false;
  }

  private boolean isDigit(char c) {
    int intC = (int) c;

    if (intC >= digitStart && intC <= digitEnd)
      return true;

    return false;
  }

  private boolean containIlligal(String s) {
    boolean valid1, valid2;

    for (int i = 0; i < s.length(); i++) {
      valid1 = isDigit(s.charAt(i));
      valid2 = isLetter(s.charAt(i));

      if (!valid1 && !valid2)
        return true;
    }

    return false;
  }
}
