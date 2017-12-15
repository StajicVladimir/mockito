package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

  StringHelper helper;

  private String input;
  private String expectedOutput;

  public StringHelperParameterizedTest(String input, String expectedOutput) {
    super();
    this.input = input;
    this.expectedOutput = expectedOutput;
  }

  @Before
  public void before() {
    this.helper = new StringHelper();
  }

  @Parameters
  public static Collection testConditions() {
    String expectedOutputs[][] = {
        { "AACD", "CD" },
        { "ACD", "CD" } };
    return Arrays.asList(expectedOutputs);

  }

  @Test
  public void testTruncateAInFirst2Positions_Ainfirst2positions() {
    assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
  }

}
