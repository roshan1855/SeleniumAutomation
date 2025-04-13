package TestJava;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandles {


    public static void main(String[] args) {

// TODO Auto-generated method stub


        System.setProperty("WebDriver.Edge.Driver", "src/target/Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

        driver.findElement(By.cssSelector(".blinkingText")).click();

        Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]

        Iterator<String> itr = windows.iterator();

        String parentId = itr.next();

        String childId = itr.next();

        driver.switchTo().window(childId);

        System.out.println("Child id is : "+childId);

        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

        driver.findElement(By.cssSelector(".im-para.red")).getText();

        String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

        driver.switchTo().window(parentId);

        driver.findElement(By.id("username")).sendKeys(emailId);


    }


}

