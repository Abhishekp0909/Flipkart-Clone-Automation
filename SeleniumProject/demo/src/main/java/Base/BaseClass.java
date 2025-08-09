package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;
    public static void launchBrowser(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://automationexercise.com");
    }
    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
    public static WebDriver getDriver(){
        return driver;
    }

}