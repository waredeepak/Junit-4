package com.controller.model.Testcases.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.controller.model.Testcases.helper.ArraysTest;
import com.controller.model.Testcases.helper.StringHelperTest;

@RunWith(Suite.class)
@SuiteClasses({ArraysTest.class,StringHelperTest.class})
public class DummyTestSuite {

}
