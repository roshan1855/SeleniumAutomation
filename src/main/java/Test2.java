import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.apache.poi.ss.usermodel.*;

import java.io.*;

import java.io.FileInputStream;
import java.sql.SQLOutput;

public class Test2 {
    public static void main(String[] args) throws IOException {

    System.setProperty("WebDriver.Edge.Driver","target/Drivers/msedgedriver.exe");

    WebDriver driver=new EdgeDriver();

     driver.manage().window().maximize();

    driver.get("https://www.facebook.com/");

    String filePath= "target/ExcelFiles/file3.xlsx";

        FileInputStream file=new FileInputStream(new File(filePath));

        Workbook workbook=new XSSFWorkbook(file);

        Sheet sheet= workbook.getSheetAt(1);

        String Username=sheet.getRow(1).getCell(0).getStringCellValue();
        String Password=sheet.getRow(1).getCell(1).getStringCellValue();

        System.out.print(Username);
        System.out.println(Password);

    }

}
