package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameter {
  @Test
  @Parameters({"username","password"})
  public void f(String username,String pass) throws Exception {
	  System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
	  WebDriver driver1=new EdgeDriver();
	  driver1.get("https://www.saucedemo.com/");
	  Thread.sleep(2000);
	  driver1.findElement(By.id("user-name")).sendKeys(username);
	  Thread.sleep(2000);
	  driver1.findElement(By.id("password")).sendKeys(pass);
	  Thread.sleep(2000);
	  driver1.findElement(By.id("login-button")).click();
	  Thread.sleep(2000);
	  driver1.close();
  }
}
