package Logo;

import Base.BaseClass;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC10LogoMobileView {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void LogoMobileView(){
        Logo logo=new Logo();
        Dimension mobileView=new Dimension(375,667);
        BaseClass.getDriver().manage().window().setSize(mobileView);
        WebElement mobileLogo=logo.getLogoElement();
        Assert.assertTrue(mobileLogo.isDisplayed(),"Test Fail:Logo Not Present on Mobile ");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
