package leetcode._3sum;

import static org.junit.Assert.*;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

import java.util.*;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private List<List<Integer>> expected, actual;
  private int[] nums;
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
    nums = new int[] {-1, 0, 1, 2, -1, -4};
    expected = new ArrayList<List<Integer>>();
    expected.add(Arrays.asList(-1, 0, 1));
    expected.add(Arrays.asList(-1, -1, 2));

    myTest();
  }

  @Test
  public void testLeetcode2() {
    nums = new int[] {0, 0, 0};
    expected = new ArrayList<List<Integer>>();
    expected.add(Arrays.asList(0, 0, 0));

    myTest();
  }

  @Test
  public void testLeetcode3() {
    nums = new int[] {2,0,-2,-5,-5,-3,2,-4};
    expected = new ArrayList<List<Integer>>();
    expected.add(Arrays.asList(-4, 2, 2));
    expected.add(Arrays.asList(-2, 0, 2));

    myTest();
  }

  private void myTest() {
    actual = s.threeSum(nums);

    assertThat(getFailMsg(), expected, containsInAnyOrder(actual.toArray()));
  }

  private String getFailMsg() {
    return g.toJson(nums);
  }
}
