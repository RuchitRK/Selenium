package com.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EleLinkText {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver1.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(2000);
		driver1.quit();
	}

}
