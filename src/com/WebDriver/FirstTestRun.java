package com.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestRun {
	public static void main(String[] args) throws InterruptedException {
		// to setup browser
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\RuchitRK\\Selenium stuffs\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.firefox.driver", "C:\\RuchitRK\\Selenium stuffs\\firefoxdriver_win64\\geckodriver.exe");
		//to open browser
		WebDriver driver1=new EdgeDriver();
		WebDriver driver2=new ChromeDriver();
		WebDriver driver3=new FirefoxDriver();
		//to open a web-site
		driver1.get("https://www.saucedemo.com/");
		driver2.get("https://www.saucedemo.com/");
		driver3.get("https://www.saucedemo.com/");
		Thread.sleep(5000); //to keep the tab open for x ms
		//driver1.close(); //to close specific tab
		driver1.quit(); //to close browser fully
		//driver2.close();
		driver2.quit();
		//driver3.close();
		driver3.quit();
	}
}