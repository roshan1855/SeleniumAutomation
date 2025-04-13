package TestJava;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TakeScreenShot {

    public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
        String Path= System.getProperty("user.dir");
        System.out.println(Path);

        //System.setProperty("webdriver.chrome.driver", Path + "src/target/Drivers/chromedriver.exe");
        // WebDriver driver=new ChromeDriver();

        System.setProperty("WebDriver.Edge.Driver", "src/target/Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        WebElement serachBox=driver.findElement(By.id("twotabsearchtextbox"));
        serachBox.sendKeys("Samsung");
        serachBox.getScreenshotAs(OutputType.FILE);


    }
}
