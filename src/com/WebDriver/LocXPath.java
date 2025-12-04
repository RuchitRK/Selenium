package com.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocXPath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("File:///C:\\Users\\User\\eclipse-workspace\\NewSelenium\\src\\com\\WebDriver\\test.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/a")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
