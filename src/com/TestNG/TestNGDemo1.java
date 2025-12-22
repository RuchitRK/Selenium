package com.TestNG;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class TestNGDemo1 {
	@Test
	public void test() {
		System.out.println("This test is Pass");
	}
	@Test
	public void failtest() {
		System.out.println("This test is Fail");
		fail();
	}
}
