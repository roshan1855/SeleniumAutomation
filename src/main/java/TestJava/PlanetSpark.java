package TestJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PlanetSpark {

    public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
        String Path = System.getProperty("user.dir");
        System.out.println(Path);

        //System.setProperty("webdriver.chrome.driver", Path + "src/target/Drivers/chromedriver.exe");
        // WebDriver driver=new ChromeDriver();

        System.setProperty("WebDriver.Edge.Driver", "C:/Users/rosha/Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        String filter_text = "samsung";


        driver.get("https://www.planetspark.in/employees/teacher_lead_bookings");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("shivalisinha4@gmail.com");
        driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("Postman#30");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[text()='Login'])[3]")).click();


        // Open the target page
        driver.get("https://www.planetspark.in/employees/teacher_lead_bookings");
        // Wait up to 30 minutes (1800 seconds) for the bold date element to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(30));
        WebElement date = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//p[contains(@class, 'mb-1') and contains(@style, 'font-weight: bold') and      (contains(., '21 may 2025') or contains(., '22 may 2025') or contains(., '23 may 2025'))]")
//                By.xpath("//p[contains(@class, 'mb-1') and contains(@style, 'font-weight: bold') and " +
//                        "contains(., '21 may 2025') or contains(., '22 may 2025') or contains(., '23 may 2025'))]]/ancestor::div[contains(@class, 'my-slider-clb-wrapper')]" +
//                        "//a[contains(@class, 'btn') and contains(text(), 'Accept')]")
        ));
        WebElement acceptButton = date.findElement(By.xpath("./ancestor::div[contains(@class, 'my-slider-clb-wrapper')]\" +\n" +
                "//                        \"//a[contains(@class, 'btn') and contains(text(), 'Accept')]"));
        System.out.println("Div element text is" +acceptButton.getText());
        acceptButton.click();

        WebElement yesButton = driver.findElement(
                By.xpath("//button[@type='button' and contains(@class, 'swal2-confirm') and contains(text(), 'Yes')]")
        );
        yesButton.click();


        //recomended code

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(6));
//
//        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(
//                By.xpath("your_xpath_here")
//        ));
//
//        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
//
    }


}
