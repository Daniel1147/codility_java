package codility.hello_world;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestHelloWorld {
  @Test
  public void testGet() {
    HelloWorld helloWorld = new HelloWorld();

    assertEquals("Hello World!", helloWorld.get());
  }
}
