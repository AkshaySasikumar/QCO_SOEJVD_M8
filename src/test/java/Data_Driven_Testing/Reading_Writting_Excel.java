package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reading_Writting_Excel {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String url=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		String title=driver.getTitle();
		System.out.println(title);
		wb.getSheet("Sheet1").createRow(6).createCell(0).setCellValue(title);
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\testData.xlsx");
		wb.write(fos);
		
	}
	

}
