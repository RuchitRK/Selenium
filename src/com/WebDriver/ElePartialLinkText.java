package com.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ElePartialLinkText {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://www.w3schools.com/");
		Thread.sleep(1000);
		driver1.findElement(By.partialLinkText("D")).click();
		Thread.sleep(2000);
		driver1.quit();
	}

}
