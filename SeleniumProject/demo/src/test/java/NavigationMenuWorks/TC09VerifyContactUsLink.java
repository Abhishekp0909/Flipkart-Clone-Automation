package NavigationMenuWorks;

import Base.BaseClass;
import NavigationMenu.Navigation;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC09VerifyContactUsLink {
    @BeforeMethod
    public void start(){
        BaseClass.launchBrowser();
    }
    @Test
    public void Test(){
        Navigation navigation=new Navigation();
        navigation.contactUs().click();
        String currentUrl=BaseClass.getDriver().getCurrentUrl();
        String contactUsUrl="https://automationexercise.com/contact_us";
        Assert.assertEquals(currentUrl,contactUsUrl,"Test Fail:Not Naviagted To Contact Us");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
