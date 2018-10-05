package random.find_sets_of_numbers_that_add_up_to_16;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int expected, actual;
  private Solution s;
  private int[] numList;
  private int sum;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void testCompile() {
    assertTrue(true);
  }

  @Test
  public void test1() {
    numList = new int[] {2, 4, 6, 10};
    sum = 16;
    expected = 2;

    myTest();
  }

  @Test
  public void test2() {
    numList = new int[] {2, 4, 6, 10};
    sum = 6;
    expected = 2;

    myTest();
  }

  @Test
  public void test3() {
    numList = new int[] {};
    sum = 0;
    expected = 1;

    myTest();
  }

  @Test
  public void test4() {
    numList = new int[] {};
    sum = 1;
    expected = 0;

    myTest();
  }

  @Test
  public void test5() {
    numList = new int[] {1, 2, 3, 4, 6};
    sum = 6;
    expected = 3;

    myTest();
  }

  private void myTest() {
    actual = s.solution(numList, sum);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format(
        "numbers: %s,\nsum: %d\nexpected: %d\nactual: %d\n",
        Arrays.toString(numList), sum, expected, actual);
  }
}
