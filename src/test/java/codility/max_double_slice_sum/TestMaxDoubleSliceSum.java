package codility.max_double_slice_sum;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.Before;

public class TestMaxDoubleSliceSum {
  private Solution s;
  private int expect, actual;
  private int[] input;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void test1() {
    input = new int[] {3, 2, 6, -1, 4, 5, -1, 2};
    expect = 17;
    myTest();
  }

  @Test
  public void test2() {
    input = new int[] {0, 9, 0, 8, 0};
    expect = 17;
    myTest();
  }

  @Test
  public void test3() {
    input = new int[] {0, 17, 0, 0};
    expect = 17;
    myTest();
  }

  @Test
  public void test4() {
    input = new int[] {0, 0, 17, 0};
    expect = 17;
    myTest();
  }

  private void myTest() {
    actual = s.solution(input);
    assertEquals(expect, actual);
  }
}
