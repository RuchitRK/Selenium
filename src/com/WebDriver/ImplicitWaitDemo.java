package com.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ImplicitWaitDemo {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://www.saucedemo.com/");
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver1.findElement(By.id("FalseField")).sendKeys("123RK");
		driver1.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("123RK");
		//Thread.sleep(1000);
		driver1.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		//Thread.sleep(1000);
		driver1.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		//Thread.sleep(2000);
	}

}
