package TestJava2;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcelData {

        public static void main(String[] args) throws IOException {
            // Path to the Excel file
            //System.out.println(System.getProperty("user.dir"));

            String filePath = "target/ExcelFiles/file1.xlsx";

            // Load the Excel file
            FileInputStream file = new FileInputStream(new File(filePath));

            // Create a workbook instance for XLSX file
            Workbook workbook = new XSSFWorkbook(file);

            // Get the first sheet
            Sheet sheet = workbook.getSheetAt(0);

            // Iterate through rows and columns
            for (Row row : sheet) {
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;
                        default:
                            System.out.print("UNKNOWN\t");
                    }
                }
                System.out.println();
            }

            // Close workbook and file
            workbook.close();
            file.close();
        }

}
