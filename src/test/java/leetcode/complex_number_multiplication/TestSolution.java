package leetcode.complex_number_multiplication;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  String a, b;
  private String expected, actual;
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
    a = "1+1i";
    b = "1+1i";
    expected = "0+2i";

    myTest();
  }

  private void myTest() {
    actual = s.complexNumberMultiply(a, b);

    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("a: %s, b: %s", a, b);
  }
}
