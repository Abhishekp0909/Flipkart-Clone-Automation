package Logo;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC15LogoDoseNotLoadUnnecessarily {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void LogoDoesNotLoadUnnecessarily() {
        Logo logo = new Logo();
        WebElement logoImage = logo.getLogoImage();

        // Capture initial page load start time
        Long initialLoadTime = (Long) ((JavascriptExecutor) BaseClass.getDriver())
                .executeScript("return window.performance.getEntriesByType('navigation')[0].startTime;");

        logoImage.click();

        try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }

        // Capture after click load time
        Long afterClickLoadTime = (Long) ((JavascriptExecutor) BaseClass.getDriver())
                .executeScript("return window.performance.getEntriesByType('navigation')[0].startTime;");

        Assert.assertEquals(initialLoadTime, afterClickLoadTime,
                "Test Failed: Logo click caused unnecessary page reload");
    }

    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
