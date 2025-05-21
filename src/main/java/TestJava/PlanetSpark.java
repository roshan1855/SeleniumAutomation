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
                By.xpath("//p[contains(@class, 'mb-1') and contains(@style, 'font-weight: bold') and      (contains(., '21 may 2025') or contains(., '22 may 2025') or contains(., '23 may 2025')  or contains(., '24 may 2025'))]")
//                By.xpath("//p[contains(@class, 'mb-1') and contains(@style, 'font-weight: bold') and " +
//                        "contains(., '21 may 2025') or contains(., '22 may 2025') or contains(., '23 may 2025'))]]/ancestor::div[contains(@class, 'my-slider-clb-wrapper')]" +
//                        "//a[contains(@class, 'btn') and contains(text(), 'Accept')]")
        ));
        WebElement parentDiv = date.findElement(By.xpath("./ancestor::div[contains(@class, 'my-slider-clb-wrapper')]"));
        System.out.println("Div element text is" +parentDiv.getText());
        String outerHtml = parentDiv.getDomProperty("outerHTML");
        System.out.println(outerHtml);
        Thread.sleep(4000);
        System.out.println("Print me before finding the accept button");
        WebElement accept_button = parentDiv.findElement(By.xpath("//a"));
        System.out.println("Accept Button is found");
        accept_button.click();
        System.out.println("Accept Button is clicked");

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement yesButton = wait1.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div/div/div[@class='swal2-actions']/button[contains(@class, 'swal2-confirm') and text()='Yes']")
        ));
        yesButton.click();

        System.out.println("Yes button is clicked successfully");


        //recomended code

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(6));
//
//        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(
//                By.xpath("your_xpath_here")
//        ));
//
//        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        //WebElement accept_button= parentDiv.findElement(By.xpath("//a[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'accept')]")).click();
//
    }


}
