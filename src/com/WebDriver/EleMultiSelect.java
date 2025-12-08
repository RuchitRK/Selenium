package com.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EleMultiSelect {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://output.jsbin.com/osebed/2");
		Thread.sleep(1000);
		WebElement multiDD=driver1.findElement(By.id("fruits"));
		Select s1=new Select(multiDD);
		Thread.sleep(1000);
		s1.selectByIndex(0);
		Thread.sleep(1000);
		s1.selectByValue("apple");
		Thread.sleep(1000);
		s1.selectByVisibleText("Orange");
		Thread.sleep(1000);
		s1.selectByContainsVisibleText("Grape");
		Thread.sleep(1000);
//		for (int i = 0; i < 4; i++) {
//			s1.selectByIndex(0);
//			Thread.sleep(1000);
//		} Will not work because its limitation I guess.
		driver1.close();
	}
}
