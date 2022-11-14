package programme4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Project_4_ForEdgeBrowser {

    public static void main(String[] args) {
        //set property
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        //create object
        WebDriver driver = new EdgeDriver();
        //launch url
        driver.get("https://www.saucedemo.com/");
        //maximise windows
        driver.manage().window().maximize();
        //give implicit time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the page title
        System.out.println("The page title is :" + driver.getTitle());
        //get current url
        System.out.println("The Current URL is :" + driver.getCurrentUrl());
        //print page source
        System.out.println("The Page source Elements is :" + driver.getPageSource());
        //Find User aname field and enter user name
        WebElement enterUser = driver.findElement(By.id("user-name"));
        enterUser.sendKeys("nareshprime@gmail.com");
        //Find Password Field and enter password
        WebElement enterPass = driver.findElement(By.name("password"));
        enterPass.sendKeys("testingng123");
        //close the browser
        //driver.quit();
    }
}
