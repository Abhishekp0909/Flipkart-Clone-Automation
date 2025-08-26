package Logo;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;
import java.awt.*;

public class TC09LogoTabletView {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void LogoTabletView(){
        Logo logo=new Logo();
        Dimension tabletSize=new Dimension(768,1024);
        BaseClass.getDriver().manage().window().setSize(tabletSize);
        WebElement tabletLogo=logo.getLogoElement();
        Assert.assertTrue(tabletLogo.isDisplayed(),"Test Fail:Logo Not Visible on Tablet");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
