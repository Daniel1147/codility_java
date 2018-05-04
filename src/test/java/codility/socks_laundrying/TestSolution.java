package codility.socks_laundrying;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int expected, actual;
  private Solution s;
  private int K;
  private int[] C, D;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void TestCompile() {
    assertTrue(true);
  }

  @Test
  public void Test1() {
    K = 1;
    C = new int[] {2, 2, 3, 3};
    D = new int[] {1};
    expected = 2;
    myTest();
  }

  @Test
  public void Test2() {
    K = 0;
    C = new int[] {2, 2, 3, 3, 4, 4};
    D = new int[] {5};
    expected = 3;
    myTest();
  }

  @Test
  public void Test3() {
    K = 2;
    C = new int[] {2, 3, 4};
    D = new int[] {2, 3, 4};
    expected = 2;
    myTest();
  }

  @Test
  public void Test4() {
    K = 4;
    C = new int[] {2, 3, 4};
    D = new int[] {2, 3, 4};
    expected = 3;
    myTest();
  }

  @Test
  public void Test5() {
    K = 4;
    C = new int[] {1};
    D = new int[] {2, 3, 4, 2};
    expected = 1;
    myTest();
  }

  @Test
  public void Test6() {
    K = 2;
    C = new int[] {1};
    D = new int[] {2, 3, 4, 5, 2, 3, 4, 5};
    expected = 1;
    myTest();
  }

  @Test
  public void Test7() {
    K = 4;
    C = new int[] {1};
    D = new int[] {2, 2, 2, 2, 2, 2, 2};
    expected = 2;
    myTest();
  }

  @Test
  public void Test8() {
    K = 6;
    C = new int[] {1};
    D = new int[] {2, 2, 2, 2, 2};
    expected = 2;
    myTest();
  }

  @Test
  public void Test9() {
    K = 3;
    C = new int[] {1};
    D = new int[] {1, 1, 1, 1, 1};
    expected = 2;
    myTest();
  }

  // @Test
  // public void TestCodility1() {
  //   K = 2;
  //   C = new int[] {1, 2, 1, 1};
  //   D = new int[] {1, 4, 3, 2, 4};
  //   expected = 3;
  //   myTest();
  // }

  private void myTest() {
    actual = s.solution(K, C, D);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("K => %d, C => %s, D => %s\n", K, Arrays.toString(C), Arrays.toString(D));
  }
}
