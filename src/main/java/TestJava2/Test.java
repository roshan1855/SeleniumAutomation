package TestJava2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Test {
    public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

        String name = "rahul";

        System.setProperty("WebDriver.Chrome.Driver", "src/target/Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //System.setProperty("WebDriver.Edge.Driver", "src/target/Drivers/msedgedriver.exe");

        //WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://spicejet.com");

        driver.findElement(By.xpath("//input[@value='Select Destination']")).click();
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz'] //*[text()='Sardar Vallabhbhai Patel International Airport']")).click();

        driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();

        Thread.sleep(000L);


        for(int i=1;i<5;i++)

        {

            driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();

        }


    }


}
