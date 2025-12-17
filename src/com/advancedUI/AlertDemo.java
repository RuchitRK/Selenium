package com.advancedUI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver1.findElement(By.name("cusid")).sendKeys("123");
		Thread.sleep(2000);
		driver1.findElement(By.name("submit")).click();
		Alert a1=driver1.switchTo().alert();
		System.out.println(a1.getText());
		Thread.sleep(2000);
		a1.dismiss(); //for cancel
		driver1.close();
		Thread.sleep(2000);
		
		System.out.println("Second RUN");
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver2=new EdgeDriver();
		driver2.get("https://demo.guru99.com/test/delete_customer.php");
		driver2.findElement(By.name("cusid")).sendKeys("123");
		Thread.sleep(2000);
		driver2.findElement(By.name("submit")).click();
		Alert a2=driver2.switchTo().alert();
		System.out.println(a2.getText());
		Thread.sleep(2000);
		a2.accept(); // for OK
		Thread.sleep(3000);
		Alert a3=driver2.switchTo().alert();
		a3.accept();
		Thread.sleep(5000);
		driver2.quit();
	}

}
