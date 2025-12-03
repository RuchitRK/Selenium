package com.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocId {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		System.setProperty("webdriver.firefox.driver", "C:\\RuchitRK\\Selenium stuffs\\firefoxdriver_win64\\geckodriver.exe");
		WebDriver driver1=new EdgeDriver();
		WebDriver driver2=new FirefoxDriver();
		driver1.manage().window().maximize();//to maximize the browser window
		driver2.manage().window().maximize();
		driver1.get("https://www.saucedemo.com/");
		driver2.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver1.findElement(By.id("user-name")).sendKeys("standard_user");
		driver2.findElement(By.id("email")).sendKeys("Ruchit_Kosambiya");
		Thread.sleep(2000);
		driver1.findElement(By.id("password")).sendKeys("secret_sauce");
		driver2.findElement(By.id("pass")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver1.findElement(By.id("login-button")).click();
		//driver2.findElement(By.id("u_0_5_1B")).click();//since id locator is not working for fb login, will use another locator name
		driver2.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver1.quit();
		driver2.quit();
	}

}
