package com.WebDriver;

import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenshotDemo {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://www.saucedemo.com/");
		driver1.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("123RK");
		Thread.sleep(1000);
		driver1.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver1.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(2000);
		File file1 = ((RemoteWebDriver)driver1).getScreenshotAs(OutputType.FILE);
		Files.copy(file1.toPath(), new File("C:\\RuchitRK\\SS\\take1.png").toPath());
		Thread.sleep(5000);
		driver1.close();
	}

}
