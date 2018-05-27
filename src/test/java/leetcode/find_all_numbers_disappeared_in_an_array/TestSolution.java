package leetcode.find_all_numbers_disappeared_in_an_array;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class TestSolution {
  private int[] nums;
  private Solution s;
  private List<Integer> expected, actual;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void testLeetcode() {
    nums = new int[] {4, 3, 2, 7, 8, 2, 3, 1};
    expected = Arrays.asList(5, 6);

    myTest();
  }

  private void myTest() {
    actual = s.findDisappearedNumbers(nums);

    assertThat(actual, is(expected));
  }
}
