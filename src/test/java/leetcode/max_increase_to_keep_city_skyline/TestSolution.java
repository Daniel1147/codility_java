package leetcode.max_increase_to_keep_city_skyline;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void testLeetcode() {
    int[][] grid;
    int expect, actual;

    grid = new int[4][];

    grid[0] = new int[] {3, 0, 8, 4};
    grid[1] = new int[] {2, 4, 5, 7};
    grid[2] = new int[] {9, 2, 6, 3};
    grid[3] = new int[] {0, 3, 1, 0};

    expect = 35;
    actual = s.maxIncreaseKeepingSkyline(grid);

    assertEquals(expect, actual);
  }
}
