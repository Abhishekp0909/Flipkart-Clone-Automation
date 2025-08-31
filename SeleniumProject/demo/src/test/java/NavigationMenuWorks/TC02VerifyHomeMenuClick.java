package NavigationMenuWorks;

import Base.BaseClass;
import NavigationMenu.Navigation;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC02VerifyHomeMenuClick {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifyHomeMenuClick(){
        Navigation navigation=new Navigation();
        String homePageUrl=BaseClass.getDriver().getCurrentUrl();
        navigation.Home().click();
        String currentUrl=BaseClass.getDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl,homePageUrl,"Test Fail:Home Option Not navigated to Homepage");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
