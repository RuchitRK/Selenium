package com.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocXPath2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://bstackdemo.com/signin");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"username\"]/div")).click(); // for xpath: inspect--> right click and copy xpath
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='demouser']")).click();// {//div[text()='txt']}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login-btn\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"signin\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"signin\"]")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
