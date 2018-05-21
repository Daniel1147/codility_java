package leetcode.min_stack;

import java.util.Stack;

class MinStack {
  private static final int INVALID = -1;

  private Stack<Integer> s;
  private int min;

  public MinStack() {
    s = new Stack<Integer>();
  }

  public void push(int x) {
    if (s.empty())
      min = x;
    else
      updateMin(x);

    s.push(x);
  }

  public void pop() {
    int n;

    n = s.pop();
    if (n == min)
      updateMin();
  }

  public int top() {
    return s.peek();
  }

  public int getMin() {
    if (s.empty())
      return INVALID;

    return min;
  }

  private void updateMin(int x) {
    if (min > x)
      min = x;
  }

  private void updateMin() {
    if (s.empty()) {
      min = INVALID;
      return;
    }

    min = s.peek();
    for (Integer num : s) {
      if (min > num)
        min = num;
    }
  }
}
