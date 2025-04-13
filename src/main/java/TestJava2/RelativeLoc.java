package TestJava2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLoc {

    public static void main(String[] args) {

        System.setProperty("WebDriver.Edge.Driver", "src/target/Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
        WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
        driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
        WebElement iceCreamLabel =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();
        WebElement rdb = driver.findElement(By.id("inlineRadio1"));

        System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());

    }

}


