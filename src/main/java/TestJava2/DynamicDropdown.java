package TestJava2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class DynamicDropdown {
    public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

        String name = "rahul";

        System.setProperty("WebDriver.Chrome.Driver", "src/target/Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //System.setProperty("WebDriver.Edge.Driver", "src/target/Drivers/msedgedriver.exe");

        //WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("autosuggest")).sendKeys("ind");

        Thread.sleep(3000);



        List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for(WebElement op : options){

            if(op.getText().equalsIgnoreCase("India"))
            {
            op.click();
            break;
            }
        }


    }
}
