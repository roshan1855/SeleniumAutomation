package TestJava2;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandles {
    public static void main(String[] args) throws Exception {


        System.setProperty("WebDriver.Edge.Driver", "src/target/Drivers/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

// Load the website
        driver.get("http://www.naukri.com/");

// It will return the parent window name as a String
        String parent=driver.getWindowHandle();

        Set<String>s=driver.getWindowHandles();

// Now iterate using Iterator
        Iterator<String> I1= s.iterator();

        while(I1.hasNext())
        {

            String child_window=I1.next();


            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);

                System.out.println(driver.switchTo().window(child_window).getTitle());

                driver.close();
            }

        }
//switch to the parent window
        driver.switchTo().window(parent);

    }
}