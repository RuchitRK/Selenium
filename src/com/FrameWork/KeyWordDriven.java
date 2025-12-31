package com.FrameWork;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class KeyWordDriven {
	@SuppressWarnings("deprecation")
	@DataProvider(name="RK")
	public Object[][] input() throws InvalidFormatException, IOException {
		Object[][] data = null;
		//1.FilePath
		String filePath = "C:\\Users\\User\\Documents\\saucedemodata.xlsx";
		//2. to make file
		File file = new File(filePath);
		//3. open a workbook
		@SuppressWarnings("resource")
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		//4. open a sheet
		Sheet sheet = workbook.getSheet("Sheet2");
		//5. to check no. of rows
		int nrow = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of Rows: "+nrow);
		data=new String[nrow][];
		//6. to select a row
		for (int i = 0; i < data.length; i++) {
			Row row = sheet.getRow(i);
			//7. to check number of cells
			int ncol=row.getPhysicalNumberOfCells();
			System.out.println("Number of cells: "+ncol);
			//8. to select a column
			data[i] = new String[ncol];
			for (int j = 0; j < data[i].length; j++) {
				Cell cell = row.getCell(j);
				//9. to convert the value to string
				cell.setCellType(CellType.STRING);
				//10. to get data from cell
				data[i][j]=cell.getStringCellValue();
			}
		}
		return data;
	}
	WebDriver driver=null;
	@Test(dataProvider = "RK")
	public void test(String keyword) throws InvalidFormatException, IOException, InterruptedException {
		@SuppressWarnings("unused")
		Object[][] data=input();
		System.setProperty("webdriver.edge.driver", "C:\\RuchitRK\\Selenium stuffs\\edgedriver_win64\\msedgedriver.exe");
		if (keyword.equalsIgnoreCase("open browser")) {
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}else if (keyword.equalsIgnoreCase("enter url")) {
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
		}else if (keyword.equalsIgnoreCase("enter username")) {
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			Thread.sleep(2000);
		}else if (keyword.equalsIgnoreCase("enter password")) {
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(2000);
		}else if (keyword.equalsIgnoreCase("click login")) {
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
		}else if (keyword.equalsIgnoreCase("close browser")) {
			driver.close();
		}	
	}
		
}
