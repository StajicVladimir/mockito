package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

  StringHelper helper;

  @Before
  public void before() {
    this.helper = new StringHelper();
  }

  @Test
  public void testTruncateAInFirst2Positions_Ainfirst2positions() {

    assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));

  }

  @Test
  public void test2TruncateAInFirst2Positions2_Ainfirstposition() {
    assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
  }

  @Test
  public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
    assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
  }

  @Test
  public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
    assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
  }
}
