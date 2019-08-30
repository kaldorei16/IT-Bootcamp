package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.PageURLs;
import pages.PeoplesPage;

public class TestPeoplesPage {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
		File src = new File("F:\\poi-4.1.0\\ZavrsniFajl.xlsx");
		
		ArrayList<String> xcellList;
		
	
	@Test
	public void archTest8() throws Exception {
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		driver.manage().window().maximize();
		driver.navigate().to(PageURLs.ARCH_PEOPLE);
		
		PeoplesPage pp = new PeoplesPage(driver);
		
		xcellList = new ArrayList<String>();
		
		for(int i = 0; i < sheet.getLastRowNum(); i++) {
			String xcell = sheet.getRow(i).getCell(0).getStringCellValue();
			xcellList.add(xcell);
		}

		Assert.assertFalse(pp.getPeopleInfo().equals(xcellList));
		
	}
	
	@Test
    public void writingInExcel() throws Exception {
        
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		driver.manage().window().maximize();
		driver.navigate().to(PageURLs.ARCH_PEOPLE);
		
		PeoplesPage pp = new PeoplesPage(driver);
		
        List<String> listOfAllPeople = pp.getPeopleInfo();
        int flag = 0;
        int rowCount = sheet.getLastRowNum();
        Row row;
        Cell cell;
        for (int i = 1; i < listOfAllPeople.size(); i++) {
            for (int j = 0; j < xcellList.size(); j++) {
                if (listOfAllPeople.get(i).equals(xcellList.get(j))) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                row = sheet.createRow(++rowCount);
                cell = row.createCell(0);
                cell.setCellValue(listOfAllPeople.get(i));
            } else {
                flag = 0;
            }
        }
        FileOutputStream output = new FileOutputStream(src);
        wb.write(output);
        wb.close();
    }
}
