package com.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EleDropDown {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(1000);
		WebElement ele=driver1.findElement(By.name("country"));
		Select s1=new Select(ele);
		Thread.sleep(1000);
		s1.selectByIndex(10);
		Thread.sleep(1000);
		s1.selectByValue("INDIA");
		Thread.sleep(1000);
		s1.selectByVisibleText("AUSTRALIA");
		Thread.sleep(1000);
		//driver1.close();
	}
}
