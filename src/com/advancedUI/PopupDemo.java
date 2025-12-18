package com.advancedUI;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PopupDemo {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		String tab1= driver1.getWindowHandle();
		System.out.println(tab1);//Just for info
		Thread.sleep(2000);
		driver1.findElement(By.partialLinkText("Here")).click();
		Thread.sleep(5000);
		Set<String> all_w = driver1.getWindowHandles();
		System.out.println(all_w); //Just for info
		Iterator<String> i1=all_w.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
			String child_w = i1.next();
			if (!child_w.equals(tab1)) {
				driver1.switchTo().window(child_w);
				Thread.sleep(2000);
				driver1.findElement(By.name("emailid")).sendKeys("rk@gmail.com");
				Thread.sleep(2000);
				driver1.findElement(By.name("btnLogin")).click();
				Thread.sleep(2000);
				driver1.close();
			}
		}
		driver1.switchTo().window(tab1);
		Thread.sleep(2000);
		driver1.close();
	}

}
