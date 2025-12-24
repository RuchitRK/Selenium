package com.TestNG;
/*
 * TestNG sequence:-
 * @BeforeSuite
 * @BeforeTest
 * @BeforeClass
 * @BeforeMethod
 * @Test
 * @AfterMethod
 * @AfterClass
 * @AfterTest
 * @AfterSuite
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGWebdriver {
	WebDriver driver1;
	
	@BeforeClass
	public void before() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		driver1=new EdgeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	@Test(priority = 0)
	public void enterUsername() throws InterruptedException {
		driver1.findElement(By.id("user-name")).sendKeys("Test_user");
		Thread.sleep(2000);
	}
	@Test(priority = 1)
	public void enterPassword() throws InterruptedException {
		driver1.findElement(By.id("password")).sendKeys("Test_password");
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void clickLoginBtn() throws InterruptedException {
		driver1.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
	@AfterClass
	public void closeTab() {
		driver1.close();
	}

}
