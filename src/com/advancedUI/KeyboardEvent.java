package com.advancedUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement email=driver1.findElement(By.name("email"));
		Actions actions=new Actions(driver1);
		Action a1=actions.moveToElement(email).click().keyDown(email,Keys.LEFT_SHIFT).sendKeys("ruchit").keyUp(Keys.LEFT_SHIFT).sendKeys("testing").doubleClick().contextClick().build();
		a1.perform();
	}
}
