package TestJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import java.util.List;

import java.util.ArrayList;

public class AddItemsToCart {

    public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
        String Path= System.getProperty("user.dir");
        System.out.println(Path);

        //System.setProperty("webdriver.chrome.driver", Path + "src/target/Drivers/chromedriver.exe");
        // WebDriver driver=new ChromeDriver();

        System.setProperty("WebDriver.Edge.Driver", "C:/Users/rosha/Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        String filter_text= "samsung";


        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        search_text(driver,"mobile");

        Thread.sleep(3000);
        addItems1(driver,filter_text);

    }

    public static void search_text(WebDriver driver, String search_text){
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox' or @title='Search For']")).sendKeys(search_text);
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public static void addItems1(WebDriver driver,String filter_text) throws InterruptedException {

        List <WebElement> elements =driver.findElements(By.xpath("//span[contains(text(),'Samsung Galaxy')]"));
        for(int i=0;i<elements.size();i++){
            System.out.println(elements.get(i).getText());
            WebElement parentDiv = elements.get(i).findElement(By.xpath("./ancestor::div[2]"));
            System.out.println(parentDiv.getTagName());
            System.out.println(parentDiv.getText());
            Thread.sleep(4000);
            WebElement firstChildWithText_Add_to_cart = parentDiv.findElement(By.className("a-button-text"));
            firstChildWithText_Add_to_cart.click();

        }
    }
}