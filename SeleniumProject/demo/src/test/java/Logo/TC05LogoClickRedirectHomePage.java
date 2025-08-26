package Logo;

import Base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC05LogoClickRedirectHomePage {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void LogoClickRedirectHomePage(){
        Logo logo=new Logo();
        logo.getLogoElement().click();
        String currentUrl=BaseClass.getDriver().getCurrentUrl();
        String expectedUrl="https://automationexercise.com/";
        Assert.assertTrue(currentUrl.equals(expectedUrl),"Test Fail:Click On Logo Not Navigating On Home Page");

    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
