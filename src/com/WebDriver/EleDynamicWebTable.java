package com.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EleDynamicWebTable {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(1000);
		//NO.of columns
		List<WebElement> ncol=driver1.findElements(By.xpath("/html/body/div[1]/div[3]/div[1]/table/tbody/tr[1]/td"));
		System.out.println("Number of columns: "+ncol.size());
		
		//No. of rows
		List<WebElement> nrow=driver1.findElements(By.xpath("/html/body/div[1]/div[3]/div[1]/table/tbody/tr"));
		System.out.println("Number of rows: "+nrow.size());
		
		for (int i = 1; i <=nrow.size(); i++) {
			for (int j = 1; j <=ncol.size(); j++) {
				String data=driver1.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print("   |   "+data);
			}
			Thread.sleep(1000);
			System.out.println();
		}
		driver1.close();
	}

}
