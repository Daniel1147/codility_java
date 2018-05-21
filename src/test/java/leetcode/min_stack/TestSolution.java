package leetcode.min_stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSolution {
  @Test
  public void testLeetcode() {
    MinStack m = new MinStack();

    m.push(-2);
    m.push(0);
    m.push(-3);
    assertEquals(-3, m.getMin());
    m.pop();
    assertEquals(0, m.top());
    assertEquals(-2, m.getMin());
  }
}
