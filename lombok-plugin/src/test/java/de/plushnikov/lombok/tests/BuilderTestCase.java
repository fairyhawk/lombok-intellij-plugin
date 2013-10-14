package de.plushnikov.lombok.tests;

import de.plushnikov.lombok.LombokParsingTestCase;

import java.io.IOException;

/**
 * Unit tests for IntelliJPlugin for Lombok, based on lombok test classes
 * For this to work, the correct system property idea.home.path needs to be passed to the test runner.
 */
public class BuilderTestCase extends LombokParsingTestCase {

  // This test is lombok's homepage example.
  public void testBuilderExample() throws IOException {
    doTest();
  }

  public void testBuilderSimple() throws IOException {
    doTest();
  }

  public void testBuilderComplex() throws IOException {
    doTest();
  }

  public void testBuilderWithExistingBuilderClass() throws IOException {
    doTest();
  }
}