package com.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EleRadioBtnAndCheckBox {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(1000);
		for (int i = 1; i <= 3; i++) {
			driver1.findElement(By.id("vfb-7-"+i)).click();
			Thread.sleep(1000);
		}
		for (int i = 0; i < 3; i++) {
			driver1.findElement(By.id("vfb-6-"+i)).click();
			Thread.sleep(1000);
		}
		for (int i = 0; i < 3; i++) {
			driver1.findElement(By.id("vfb-6-"+i)).click();
			Thread.sleep(1000);
		}
		driver1.close();
	}
}
