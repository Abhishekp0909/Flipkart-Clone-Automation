package Logo;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01LogoVisibility {
    @BeforeMethod
    public void setup(){
        BaseClass base=new BaseClass();
        base.launchBrowser();
    }
    @Test
    public void LogoVisibility(){
        Logo logo=new Logo();

        WebElement avLogo=logo.getLogoElement();
        Assert.assertTrue(avLogo.isDisplayed(),"Test Fail:Logo Not Available");
    }
    @AfterMethod
    public void teardown(){
        BaseClass.closeBrowser();
    }
}
