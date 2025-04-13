package TestJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NumberOfLinks {

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

       int no_of_links=driver.findElements(By.tagName("a")).size();

        System.out.println("Number of links on the page is "+no_of_links);

        WebElement footer_section=driver.findElement(By.cssSelector(".navFooterMoreOnAmazon.navFooterMoreOnAmazonWrapper"));
        int no_of_links_in_footer=footer_section.findElements(By.tagName("a")).size();

        System.out.println("Number of links on the footer section is "+no_of_links_in_footer);

    }

}
