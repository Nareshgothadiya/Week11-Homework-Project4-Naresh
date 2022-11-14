package programme4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Project_4_ForChromeBrowser {

    public static void main(String[] args) {
        //set driver property
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        //create object
        WebDriver driver = new ChromeDriver();
        //Launch the url
        driver.get("https://www.saucedemo.com/");
        //Maximize window
        driver.manage().window().maximize();
        //give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //print the title of the page
        System.out.println("The Page title is :" + driver.getTitle());
        //print Current URL
        System.out.println("The Current URL is :" + driver.getCurrentUrl());
        //print the page source
        System.out.println("The page source is :" + driver.getPageSource());
        //Find the Email field element and send the email
        WebElement enterUser = driver.findElement(By.id("user-name"));
        enterUser.sendKeys("primetesting@gmail.com");
        //Type email in to email field and send password
        WebElement enterPassword = driver.findElement(By.name("password"));
        enterPassword.sendKeys("testing123");
        //close browser
        //driver.quit();
    }
}
