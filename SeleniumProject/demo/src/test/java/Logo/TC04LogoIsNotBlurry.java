package Logo;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC04LogoIsNotBlurry {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void LogoIsNotBlurry(){
        Logo logo=new Logo();
        WebElement mainLogo=logo.getLogoImage();
        Assert.assertTrue(mainLogo.isDisplayed(),"Test Fail:Logo is Blurry");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
