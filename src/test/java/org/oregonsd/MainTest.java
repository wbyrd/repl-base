package org.oregonsd;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.jupiter.api.Test;

/**
 * @author wbyrd
 *
 */
public class MainTest {

  @Test
  public void test() {
    assertThat(Main.getGreeting(), equalTo("Hello World!"));
  }
}