package leetcode.two_sum_ii;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int[] expected, actual;
  private int[] numbers;
  private int target;
  private Solution s;
  private Gson g = new Gson();

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void testCompile() {
    assertTrue(true);
  }

  @Test
  public void testLeetcode1() {
    numbers = new int[] {2,7,11,15};
    expected = new int[] {1, 2};
    target = 9;

    myTest();
  }

  private void myTest() {
    actual = s.twoSum(numbers, target);

    assertArrayEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("numbers: %s, target: %d", g.toJson(numbers), target);
  }
}
