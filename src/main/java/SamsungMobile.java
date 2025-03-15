// open edge browser
// open amazon.in
// type mobile in search box
// click on lens
// select all samsung mobile and put them on list                 //Thread.sleep(5000)
// iterate through element and add them to cart  /



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import java.util.List;

public class SamsungMobile {

    public static void main(String[] args) throws InterruptedException {
        String path=System.getProperty("user.dir");
        System.out.println("Project path is :"+path);

        System.setProperty("WebDriver.Edge.Driver","target/Drivers/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        String mobile_name="mobile";

        search(driver,mobile_name);

        String brand_name="Apple";
        addToCart(driver,brand_name);
    }
    private static void search(WebDriver driver, String mobile_name) throws InterruptedException{

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(mobile_name);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();
        Thread.sleep(5000);
    }
    private static void addToCart(WebDriver driver, String brand_name) throws InterruptedException {
        List<WebElement> textEle_sg=driver.findElements(By.xpath("//span[contains(text(),'"+brand_name+"')]"));
        for(int i=0;i<textEle_sg.size();i++){
            System.out.println("Element is :"+textEle_sg.get(i).getText());
            WebElement ancestorDiv=textEle_sg.get(i).findElement(By.xpath("./ancestor::div[2]"));
            System.out.println("Parent element is :"+ancestorDiv.getText());
            Thread.sleep(5000);
            WebElement add_to_cart=ancestorDiv.findElement(By.className("a-button-text"));
            add_to_cart.click();
        }

    }




}
