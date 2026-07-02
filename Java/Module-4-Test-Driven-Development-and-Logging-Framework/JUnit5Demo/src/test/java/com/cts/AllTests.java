package com.cts;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
	CalculateTestChecker.class,
        EvenTestChecker.class
})
public class AllTests {

}
