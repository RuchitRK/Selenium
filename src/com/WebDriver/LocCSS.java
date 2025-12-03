package com.WebDriver;

import java.awt.im.InputContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocCSS {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\\\RuchitRK\\\\Selenium stuffs\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.facebook.com/");
		driver1.findElement(By.cssSelector("input#email")).sendKeys("Ruchit_Kosambiya");// (CSS ID: tag_name#id)
		Thread.sleep(5000);
		driver1.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("randomtest123"); // CSS Class: If 'spaces' then replace it with ' . ' (tag_name.class_value)
		Thread.sleep(5000);
		driver1.findElement(By.cssSelector("button[data-testid='royal-login-button']")).click(); // CSS Attribute: (tag_name[attr_name='attr_value'])
		Thread.sleep(5000);
		driver1.quit();
	}
}
