package TestJava2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateExcelFile {


        public static void main(String[] args) {
            String filePath = "target/ExcelFiles/file10.txt"; // Change this path

            File file = new File(filePath);
            try {
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getAbsolutePath());
                } else {
                    System.out.println("File already exists.");
                }

                // Writing to the file
                FileWriter writer = new FileWriter(file);
                writer.write("Hello, this is a new file created in Java.");
                writer.close();

                System.out.println("Data written to file successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }


}
