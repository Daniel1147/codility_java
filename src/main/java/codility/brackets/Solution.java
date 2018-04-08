package codility.brackets;

import java.util.HashMap;
import java.util.Stack;

class Solution {
  public int solution(String S) {
    Character[] characterList = new Character[] {'(', ')', '[', ']', '{', '}'};
    Stack<Character> stack = new Stack<Character>();
    int i;
    Character currentCharater, expected, stackTop;
    HashMap<Character, Character> startBracket = new HashMap<Character, Character>();
    HashMap<Character, Character> endBracket = new HashMap<Character, Character>();

    // start bracket
    startBracket.put(characterList[0], characterList[1]);
    startBracket.put(characterList[2], characterList[3]);
    startBracket.put(characterList[4], characterList[5]);

    // end bracket
    endBracket.put(characterList[1], characterList[0]);
    endBracket.put(characterList[3], characterList[2]);
    endBracket.put(characterList[5], characterList[4]);

    for (i = 0; i < S.length(); i++) {
      currentCharater = new Character(S.charAt(i));
      /* System.out.printf("current character is %c\n", currentCharater.charValue()); */
      if (startBracket.containsKey(currentCharater)) {
        stack.push(currentCharater);

        continue;
      }

      if (stack.empty()) {
        return 0;
      }

      stackTop = stack.pop();

      expected = endBracket.get(currentCharater);
      /* System.out.printf("Expected %c, got %c\n", expected.charValue(), currentCharater.charValue()); */
      if (expected.compareTo(stackTop) != 0) {
        return 0;
      }

      continue;
    }

    if (stack.empty()) {
      return 1;
    }

    return 0;
  }
}
