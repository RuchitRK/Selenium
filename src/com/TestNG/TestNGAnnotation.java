package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	@BeforeClass
	public void beforeClassTest(){
		System.out.println("This is Before Class");
	}
	@BeforeMethod
	public void beforeMethodTest() {
		System.out.println("This is Before every method");
	}
	@Test
	public void Test1() {
		System.out.println("This is Test 1");
	}
	@Test
	public void Test2() {
		System.out.println("This is Test 2");
	}
	@AfterMethod
	public void afterMethodTest() {
		System.out.println("This is After every method");
	}
	@AfterClass
	public void afterClassTest() {
		System.out.println("This is After Class");
	}
	
}
