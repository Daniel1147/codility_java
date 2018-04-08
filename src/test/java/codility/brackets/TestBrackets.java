package codility.brackets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

class TestBrackets {
  public static void main(String[] args) {
    ArrayList<String> inputList = new ArrayList<String>();
    Solution solution = new Solution();
    int ans;

    // inputs
    inputList.add("{[()()]}");
    inputList.add("([)()]");
    inputList.add("{{{{");

    for (String input : inputList) {
      ans = solution.solution(input);
      System.out.printf("ans of %s is %d\n", input, ans);
    }
  }
}
