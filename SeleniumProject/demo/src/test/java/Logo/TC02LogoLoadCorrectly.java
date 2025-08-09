package Logo;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC02LogoLoadCorrectly {
    @BeforeMethod
    public void open() {
        BaseClass.launchBrowser();
    }
    @Test
    public  void logoLoadsCorrectly() {
        Logo logo = new Logo();
        WebElement logoImage =logo.getLogoImage();
        Assert.assertTrue(logoImage.isDisplayed(),"Test Fail:Logo Source is incorrect");

        String actualSrc=logoImage.getAttribute("src");
        Assert.assertTrue(actualSrc.contains("/static/images/home/logo.png"),"Test Fail:Logo Source Incorrect"+actualSrc);
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
