package TestJava2;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class UsingExcelDataToLogin {

    public static void main(String[] args) throws IOException {
        // Path to the Excel file
        //System.out.println(System.getProperty("user.dir"));


        System.setProperty("WebDriver.Edge.Driver", "src/target/Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.facebook.com/");

        String filePath = "target/ExcelFiles/file2.xlsx";
        // Load the Excel file
        FileInputStream file = new FileInputStream(new File(filePath));

        // Create a workbook instance for XLSX file
        Workbook workbook = new XSSFWorkbook(file);

        // Get the first sheet
        Sheet sheet = workbook.getSheetAt(0);


// Read data from Excel
        String username = sheet.getRow(1).getCell(0).getStringCellValue();
        String password = sheet.getRow(1).getCell(1).getStringCellValue();

// Enter data into login fields
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);


    }
}
