package leetcode.min_stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSolution {
  MinStack m;

  @Test
  public void testLeetcode() {
    m = new MinStack();

    m.push(-2);
    m.push(0);
    m.push(-3);
    assertEquals(-3, m.getMin());
    m.pop();
    assertEquals(0, m.top());
    assertEquals(-2, m.getMin());
  }

  @Test
  public void test1() {
    testLeetcode();
    m.pop();
    assertEquals(-2, m.top());
    assertEquals(-2, m.getMin());
  }

  @Test
  public void test2() {
    test1();
    m.pop();
  }
}
