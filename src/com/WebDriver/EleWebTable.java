package com.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EleWebTable {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.get("File:///C:\\Users\\User\\eclipse-workspace\\NewSelenium\\src\\com\\WebDriver\\table.html");
		String data;
		for (int i = 2; i < 5; i++) {
			for (int j = 1; j <=4; j++) {
				data=driver1.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print("   |   "+data);
			}
			System.out.println();
		}
	}
}
