package codility.stone_wall;

import java.util.Stack;

class StoneWall {
  public static void main(String argv[]) {
    /* int[] input = new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8}; */
    int[] input = new int[] {8, 0, 8, 0, 8};
    int ans;

    StoneWall stoneWall = new StoneWall();
    ans = stoneWall.solution(input);

    System.out.printf("answer is %s.\n", ans);
  }

  public int solution(int[] input) {
    Stack<Integer> stack = new Stack<Integer>();
    int i, currentHeight;

    int counter = 0;

    for (i = 0; i < input.length; i++) {
      currentHeight = input[i];

      // pop out all elements in stack which are greater than current height
      while (!stack.empty()) {
        if (stack.peek() > currentHeight) {
          stack.pop();

          continue;
        }

        if (stack.peek() <= currentHeight) {

          break;
        }
      }

      // empty stack case
      if (stack.empty()) {
        if (currentHeight > 0) {
          stack.push(new Integer(currentHeight));
          counter++;
        }

        continue;
      }

      if (stack.peek() == currentHeight) {

        continue;
      }

      stack.push(new Integer(currentHeight));
      counter++;
    }

    return counter;
  }
}
