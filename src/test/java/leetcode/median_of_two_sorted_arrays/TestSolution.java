package codility.median_of_two_sorted_arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private double expected, actual;
  private int[] num1, num2;
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void TestCompile() {
    assertTrue(true);
  }

  @Test
  public void test1() {
    num1 = new int[] {1};
    num2 = new int[] {};
    expected = 1;
    myTest();
  }


  @Test
  public void test2() {
    num1 = new int[] {};
    num2 = new int[] {2};
    expected = 2;
    myTest();
  }

  @Test
  public void test3() {
    num1 = new int[] {1, 2, 3};
    num2 = new int[] {4, 5};
    expected = 3;
    myTest();
  }

  @Test
  public void test4() {
    num1 = new int[] {1, 2};
    num2 = new int[] {};
    expected = 1.5;
    myTest();
  }

  @Test
  public void test5() {
    num1 = new int[] {3};
    num2 = new int[] {4};
    expected = 3.5;
    myTest();
  }

  @Test
  public void test6() {
    num1 = new int[] {};
    num2 = new int[] {5, 6};
    expected = 5.5;
    myTest();
  }


  @Test
  public void testLeetcode1() {
    num1 = new int[] {1, 3};
    num2 = new int[] {2};
    expected = 2;
    myTest();
  }

  @Test
  public void testLeetcode2() {
    num1 = new int[] {1, 2};
    num2 = new int[] {3, 4};
    expected = 2.5;
    myTest();
  }

  private void myTest() {
    actual = s.findMedianSortedArrays(num1, num2);
    assertEquals(getFailMsg(), expected, actual, 0.001);
  }

  private String getFailMsg() {
    return String.format("num1 => %s, num2 => %s\n", Arrays.toString(num1), Arrays.toString(num2));
  }
}
