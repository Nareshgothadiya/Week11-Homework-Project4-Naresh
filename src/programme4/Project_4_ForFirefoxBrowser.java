package programme4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Project_4_ForFirefoxBrowser {

    public static void main(String[] args) {
        //Set Property
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        //create object
        WebDriver driver = new FirefoxDriver();

        //launch url
        driver.get("https://www.saucedemo.com/");
        //maximise windows
        driver.manage().window().maximize();
        //give implicit time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //get page title
        System.out.println("The Page Title is : "+driver.getTitle());
        //get current url
        System.out.println("The Current URL is :"+driver.getCurrentUrl());
        //get page source
        System.out.println("The Page source elements :"+driver.getPageSource());

        //Find Username field and enter username
        WebElement enterUsername = driver.findElement(By.id("user-name"));
        enterUsername.sendKeys("primeteam@gmail.com");

        //Find Password Field and enter password
        WebElement enterPassword = driver.findElement(By.name("password"));
        enterPassword.sendKeys("selenium123");

        //Close the browser
        //driver.quit();

    }
}
