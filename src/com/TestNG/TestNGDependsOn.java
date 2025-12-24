package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestNGDependsOn {
WebDriver driver1;
	
	@Test
	public void before() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		driver1=new EdgeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods = "before")
	public void enterUsername() throws InterruptedException {
		driver1.findElement(By.id("user-name")).sendKeys("Test_user");
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods = "enterUsername")
	public void enterPassword() throws InterruptedException {
		driver1.findElement(By.id("password")).sendKeys("Test_password");
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods = "enterPassword")
	public void clickLoginBtn() throws InterruptedException {
		driver1.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods = "clickLoginBtn")
	public void closeTab() {
		driver1.close();
	}
}
