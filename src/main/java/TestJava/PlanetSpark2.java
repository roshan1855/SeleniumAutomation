package TestJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PlanetSpark2 {

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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement acceptButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//p[contains(., 'Tue, 22 Apr 01:04 PM')]/ancestor::div[contains(@class, 'my-slider-clb-wrapper')]" +
                        "//a[contains(@class, 'btn') and contains(text(), 'Accept')]")
        ));
        System.out.println("Div element text is" +acceptButton.getText());
        acceptButton.click();

//        WebElement yesButton = driver.findElement(
//                By.xpath("//button[@type='button' and contains(@class, 'swal2-confirm') and contains(text(), 'Yes')]")
//        );
//        yesButton.click();


//        List<WebElement> acceptButton = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
//                By.xpath("//p[contains(., ' Mon, 07 Apr')]/ancestor::div[contains(@class, 'card')]" +
//                        "//a[contains(@class, 'btn') and contains(text(), 'Accept')]"))
//        );
       // System.out.println("after Wait statement");
        //acceptButton.click();

//            // Wait for <p> tag with 'font-weight: bold' style to appear
//        List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
//                By.xpath("//p[contains(., 'Tue, 22 Apr') or contains(., 'Sun, 11 May') or contains(., 'Mon, 12 May')]")
//        ));
//
//        for(int i=0;i<acceptButton.size();i++){
//            System.out.println(acceptButton.get(i).getText());
//
//        }


        //🔥 PI booked candidates
    }

    // to find unique element
    ////p[contains(@class, 'mb-1') and contains(@style, 'font-weight: bold') and      (contains(., '21 may 2025') or contains(., '22 may 2025') or contains(., '23 may 2025'))]


}
