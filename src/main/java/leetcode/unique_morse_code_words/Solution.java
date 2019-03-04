package leetcode.unique_morse_code_words;

import java.util.*;

class Solution {
  private String[] morseDic = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

  public int uniqueMorseRepresentations(String[] words) {
    Set<String> morseWords = new HashSet<String>();
    String morse;

    for (int i = 0; i < words.length; i++) {
      morse = toMorse(words[i]);
      // System.out.println(morse);

      morseWords.add(morse);
    }

    return morseWords.size();
  }

  private String toMorse(String str) {
    String result = "";
    char c;

    for (int i = 0; i < str.length(); i++) {
      c = str.charAt(i);
      result = result + charToMorse(c);
    }

    return result;
  }

  private String charToMorse(char c) {
    int i;

    i = c - 'a';

    return morseDic[i];
  }
}
