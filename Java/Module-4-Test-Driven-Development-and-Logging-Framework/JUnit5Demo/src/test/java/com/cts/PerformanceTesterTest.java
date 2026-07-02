package com.cts;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class PerformanceTesterTest {
@Test
public void Tester() {
	PerfromanceTester pf= new PerfromanceTester();
	assertTimeout(Duration.ofSeconds(2),()->{
	pf.performanceTest();
	});
	
}
}
