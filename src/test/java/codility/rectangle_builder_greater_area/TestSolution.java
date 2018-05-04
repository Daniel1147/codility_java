package codility.rectangle_builder_greater_area;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int[] A;
  private int X;
  private int expected, actual;
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
  public void TestCodility1() {
    A = new int[] {1, 2, 5, 1, 1, 2, 3, 5, 1};
    X = 5;
    expected = 2;
    myTest();
  }

  @Test
  public void TestCodility2() {
    A = new int[] {6, 6, 6, 6, 6};
    X = 10;
    expected = 1;
    myTest();
  }

  @Test
  public void TestCodility3() {
    A = new int[] {2, 3, 2, 3, 2, 3, 2, 3};
    X = 9;
    expected = 1;
    myTest();
  }

  @Test
  public void TestSquare1() {
    A = new int[] {3, 3};
    X = 9;
    expected = 0;
    myTest();
  }

  @Test
  public void TestSquare2() {
    A = new int[] {3, 3, 3, 3};
    X = 9;
    expected = 1;
    myTest();
  }

  @Test
  public void Test1() {
    A = new int[] {1, 2, 2, 3, 3, 1, 3, 3};
    X = 2;
    expected = 4;
    myTest();
  }

  @Test
  public void Test2() {
    A = new int[] {1, 1, 2, 2, 3, 3, 5, 5, 8, 8, 13, 13};
    X = 2;
    expected = 15;
    myTest();
  }

  @Test
  public void Test3() {
    A = new int[] {1, 1, 2, 2, 2, 5, 5, 7, 8, 8, 9, 9, 10, 10, 11, 13, 13, 14, 14, 14, 16, 16, 16};
    X = 1;
    expected = 36;
    myTest();
  }

  @Test
  public void Test4() {
    A = new int[] {1, 2, 5, 1, 1, 2, 3, 5, 1};
    X = 6;
    expected = 1;
    myTest();
  }

  private void myTest() {
    actual = s.solution(A, X);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("intput: A => %s, X => %d\n", Arrays.toString(A), X);
  }
}
