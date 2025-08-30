package Logo;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC13LogoLoadTime {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void LogoLoadTime(){
        Logo logo=new Logo();
        long startTime=System.currentTimeMillis();
        WebDriverWait wait=new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(5));
        WebElement logoImage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/static/images/home/logo.png']")));
        long endTime=System.currentTimeMillis();
        long loadTime=endTime-startTime;
        Assert.assertTrue(loadTime<=2000,"Test Fail:Logo Took More Then 2 Seconds"+loadTime+"ms");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
