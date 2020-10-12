package org.oregonsd;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.jupiter.api.Test;

/**
 * @author wbyrd
 *
 */
public class MainTest {

  @Test
  public void test() {
    assertThat("Hello World!", equalTo(Main.getGreeting()));
  }
}