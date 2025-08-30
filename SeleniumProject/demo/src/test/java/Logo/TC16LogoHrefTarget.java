package Logo;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC16LogoHrefTarget {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void LogoHrefTarget(){
        Logo logo=new Logo();
        WebElement logoImage=logo.getLogoElement();
        String actualRef=logoImage.getAttribute("href");
        String expectedHref="www.example.com";
        Assert.assertEquals(actualRef,expectedHref,"Test Fail:Href did not match");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
