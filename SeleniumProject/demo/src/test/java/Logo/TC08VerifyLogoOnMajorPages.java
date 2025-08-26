package Logo;

import Base.BaseClass;
import MainPage.HomePageMenu;
import com.beust.ah.A;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC08VerifyLogoOnMajorPages {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifyLogoOnMajorPages(){
        HomePageMenu page=new HomePageMenu();
        Logo logo=new Logo();
        page.getHomePage();
       WebElement Logo= logo.getLogoElement();
        Assert.assertTrue(Logo.isDisplayed(),"Test Fail:Logo Is Not present on Home Page");
        page.getProductPage();
        WebElement productLogo=logo.getLogoElement();
        Assert.assertTrue(productLogo.isDisplayed(),"Test Fail:Logo Is Not present on Product Page");
        page.getHomePage();
        page.getCartPage();
        WebElement cartLogo=logo.getLogoElement();
        Assert.assertTrue(cartLogo.isDisplayed(),"Test Fail:Logo Is Not present on Cart  Page");
        page.getHomePage();
        page.getLoginPage();
        WebElement loginLogo=logo.getLogoElement();
        Assert.assertTrue(loginLogo.isDisplayed(),"Test Fail:Logo Is Not present on Home Page");
        page.getHomePage();
        page.getContactUsPage();
        WebElement contactLogo=logo.getLogoElement();
        Assert.assertTrue(contactLogo.isDisplayed(),"Test Fail:Logo Is Not present on Home Page");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
