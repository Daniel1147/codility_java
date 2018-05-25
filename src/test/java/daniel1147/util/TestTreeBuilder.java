package daniel1147.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.Before;

public class TestTreeBuilder {
  TreeBuilder s;
  SampleTreeOperator o;

  @Before
  public void setUp() {
    o = new SampleTreeOperator();
    s = new TreeBuilder(o);
  }

  @Test
  public void test1() {
    String input = "";

    s.levelOrderConstruct(input);
    assertNull(o.getSampleTree());
  }

  @Test
  public void test2() {
    String input = "10";

    s.levelOrderConstruct(input);
    SampleTree r = o.getSampleTree();
    assertEquals(10, r.value());
    assertNull(r.left());
    assertNull(r.right());
  }

  @Test
  public void test3() {
    String input = "10 5";

    s.levelOrderConstruct(input);
    SampleTree r = o.getSampleTree();
    assertEquals(10, r.value());
    assertNotNull(r.left());
    assertEquals(5, r.left().value());
    assertNull(r.right());
  }

  @Test
  public void test4() {
    String input = "10 x 5 1 2";

    s.levelOrderConstruct(input);
    SampleTree r = o.getSampleTree();
    assertEquals(10, r.value());
    assertNull(r.left());
    assertNotNull(r.right());
    assertEquals(5, r.right().value());
    assertNotNull(r.right().left());
    assertEquals(1, r.right().left().value());
    assertNotNull(r.right().right());
    assertEquals(2, r.right().right().value());
  }
}
