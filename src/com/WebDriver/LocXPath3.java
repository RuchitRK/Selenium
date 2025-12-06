package com.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocXPath3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://demo.guru99.com/test/selenium-xpath.html");
		// //tag_name[@attr_name='attr_value']
		driver1.findElement(By.xpath("//input[@name='uid']")).sendKeys("RK123");
		Thread.sleep(1000);
		driver1.findElement(By.xpath("//input[@type='password']")).sendKeys("456RK");
		Thread.sleep(5000);
		driver1.findElement(By.xpath("//input[@value='RESET']")).click();
		Thread.sleep(3000);
		driver1.quit();
	}
}
