package com.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver1.findElement(By.xpath("//*[@id=\"post-body-7708391096228750161\"]/button")).click();
		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(20));
		WebElement myElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		System.out.println(myElement.getText());
	}

}
