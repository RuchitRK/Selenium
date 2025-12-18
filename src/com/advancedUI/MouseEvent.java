package com.advancedUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		WebElement home=driver1.findElement(By.linkText("Home"));
		WebElement flights=driver1.findElement(By.linkText("Flights"));
		WebElement hotes=driver1.findElement(By.linkText("Hotels"));
		
		Actions actions=new Actions(driver1);
		Action a1=actions.moveToElement(home).build();
		a1.perform();
		Thread.sleep(2000);
		Action a2=actions.moveToElement(flights).build();
		a2.perform();
		Thread.sleep(2000);
		Action a3=actions.moveToElement(hotes).build();
		a3.perform();
		Thread.sleep(2000);
		driver1.quit();
	}
}
